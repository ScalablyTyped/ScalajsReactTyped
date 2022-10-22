package typingsJapgolly.firebaseAdmin

import typingsJapgolly.firebaseAdmin.libAppCoreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRemoteConfigRemoteConfigNamespaceMod {
  
  object remoteConfig {
    
    inline def apply(): RemoteConfig = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[RemoteConfig]
    inline def apply(app: App): RemoteConfig = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[RemoteConfig]
    
    @JSImport("firebase-admin/lib/remote-config/remote-config-namespace", "remoteConfig")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Type alias to {@link firebase-admin.remote-config#ExplicitParameterValue}.
      */
    type ExplicitParameterValue = typingsJapgolly.firebaseAdmin.libRemoteConfigRemoteConfigApiMod.ExplicitParameterValue
    
    /**
      * Type alias to {@link firebase-admin.remote-config#InAppDefaultValue}.
      */
    type InAppDefaultValue = typingsJapgolly.firebaseAdmin.libRemoteConfigRemoteConfigApiMod.InAppDefaultValue
    
    /**
      * Type alias to {@link firebase-admin.remote-config#ListVersionsOptions}.
      */
    type ListVersionsOptions = typingsJapgolly.firebaseAdmin.libRemoteConfigRemoteConfigApiMod.ListVersionsOptions
    
    /**
      * Type alias to {@link firebase-admin.remote-config#ListVersionsResult}.
      */
    type ListVersionsResult = typingsJapgolly.firebaseAdmin.libRemoteConfigRemoteConfigApiMod.ListVersionsResult
    
    /**
      * Type alias to {@link firebase-admin.remote-config#ParameterValueType}.
      */
    type ParameterValueType = typingsJapgolly.firebaseAdmin.libRemoteConfigRemoteConfigApiMod.ParameterValueType
    
    /**
      * Type alias to {@link firebase-admin.remote-config#RemoteConfig}.
      */
    type RemoteConfig = typingsJapgolly.firebaseAdmin.libRemoteConfigRemoteConfigMod.RemoteConfig
    
    /**
      * Type alias to {@link firebase-admin.remote-config#RemoteConfigCondition}.
      */
    type RemoteConfigCondition = typingsJapgolly.firebaseAdmin.libRemoteConfigRemoteConfigApiMod.RemoteConfigCondition
    
    /**
      * Type alias to {@link firebase-admin.remote-config#RemoteConfigParameter}.
      */
    type RemoteConfigParameter = typingsJapgolly.firebaseAdmin.libRemoteConfigRemoteConfigApiMod.RemoteConfigParameter
    
    /**
      * Type alias to {@link firebase-admin.remote-config#RemoteConfigParameterGroup}.
      */
    type RemoteConfigParameterGroup = typingsJapgolly.firebaseAdmin.libRemoteConfigRemoteConfigApiMod.RemoteConfigParameterGroup
    
    /**
      * Type alias to {@link firebase-admin.remote-config#RemoteConfigParameterValue}.
      */
    type RemoteConfigParameterValue = typingsJapgolly.firebaseAdmin.libRemoteConfigRemoteConfigApiMod.RemoteConfigParameterValue
    
    /**
      * Type alias to {@link firebase-admin.remote-config#RemoteConfigTemplate}.
      */
    type RemoteConfigTemplate = typingsJapgolly.firebaseAdmin.libRemoteConfigRemoteConfigApiMod.RemoteConfigTemplate
    
    /**
      * Type alias to {@link firebase-admin.remote-config#RemoteConfigUser}.
      */
    type RemoteConfigUser = typingsJapgolly.firebaseAdmin.libRemoteConfigRemoteConfigApiMod.RemoteConfigUser
    
    /**
      * Type alias to {@link firebase-admin.remote-config#TagColor}.
      */
    type TagColor = typingsJapgolly.firebaseAdmin.libRemoteConfigRemoteConfigApiMod.TagColor
    
    /**
      * Type alias to {@link firebase-admin.remote-config#Version}.
      */
    type Version = typingsJapgolly.firebaseAdmin.libRemoteConfigRemoteConfigApiMod.Version
  }
}
