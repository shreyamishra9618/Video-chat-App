package io.flutter.plugins;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.plugins.shim.ShimPluginRegistry;

/**
 * Generated file. Do not edit.
 * This file is generated by the Flutter tool based on the
 * plugins that support the Android platform.
 */
@Keep
public final class GeneratedPluginRegistrant {
  public static void registerWith(@NonNull FlutterEngine flutterEngine) {
    ShimPluginRegistry shimPluginRegistry = new ShimPluginRegistry(flutterEngine);
      io.agora.agorartcengine.AgoraRtcEnginePlugin.registerWith(shimPluginRegistry.registrarFor("io.agora.agorartcengine.AgoraRtcEnginePlugin"));
      io.agora.agorartm.AgoraRtmPlugin.registerWith(shimPluginRegistry.registrarFor("io.agora.agorartm.AgoraRtmPlugin"));
    flutterEngine.getPlugins().add(new io.flutter.plugins.firebase.cloudfirestore.CloudFirestorePlugin());
    flutterEngine.getPlugins().add(new io.flutter.plugins.firebaseauth.FirebaseAuthPlugin());
    flutterEngine.getPlugins().add(new io.flutter.plugins.firebase.core.FirebaseCorePlugin());
    flutterEngine.getPlugins().add(new io.flutter.plugins.firebase.storage.FirebaseStoragePlugin());
      io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin.registerWith(shimPluginRegistry.registrarFor("io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin"));
    flutterEngine.getPlugins().add(new io.github.ponnamkarthik.toast.fluttertoast.FlutterToastPlugin());
    flutterEngine.getPlugins().add(new io.flutter.plugins.googlesignin.GoogleSignInPlugin());
    flutterEngine.getPlugins().add(new io.flutter.plugins.imagepicker.ImagePickerPlugin());
    flutterEngine.getPlugins().add(new io.flutter.plugins.pathprovider.PathProviderPlugin());
      com.baseflow.permissionhandler.PermissionHandlerPlugin.registerWith(shimPluginRegistry.registrarFor("com.baseflow.permissionhandler.PermissionHandlerPlugin"));
    flutterEngine.getPlugins().add(new io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin());
    flutterEngine.getPlugins().add(new com.tekartik.sqflite.SqflitePlugin());
  }
}
