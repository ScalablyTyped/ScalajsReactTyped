package typingsJapgolly.firebaseAdmin

import typingsJapgolly.firebaseAdmin.libAppCoreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProjectManagementMod {
  
  @JSImport("firebase-admin/lib/project-management", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/lib/project-management", "AndroidApp")
  @js.native
  open class AndroidApp ()
    extends typingsJapgolly.firebaseAdmin.libProjectManagementAndroidAppMod.AndroidApp
  
  @JSImport("firebase-admin/lib/project-management", "AppPlatform")
  @js.native
  object AppPlatform extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.firebaseAdmin.libProjectManagementAppMetadataMod.AppPlatform & String
      ] = js.native
    
    /* "ANDROID" */ val ANDROID: typingsJapgolly.firebaseAdmin.libProjectManagementAppMetadataMod.AppPlatform.ANDROID & String = js.native
    
    /* "IOS" */ val IOS: typingsJapgolly.firebaseAdmin.libProjectManagementAppMetadataMod.AppPlatform.IOS & String = js.native
    
    /* "PLATFORM_UNKNOWN" */ val PLATFORM_UNKNOWN: typingsJapgolly.firebaseAdmin.libProjectManagementAppMetadataMod.AppPlatform.PLATFORM_UNKNOWN & String = js.native
  }
  
  @JSImport("firebase-admin/lib/project-management", "IosApp")
  @js.native
  open class IosApp ()
    extends typingsJapgolly.firebaseAdmin.libProjectManagementIosAppMod.IosApp
  
  @JSImport("firebase-admin/lib/project-management", "ProjectManagement")
  @js.native
  open class ProjectManagement ()
    extends typingsJapgolly.firebaseAdmin.libProjectManagementProjectManagementMod.ProjectManagement
  
  @JSImport("firebase-admin/lib/project-management", "ShaCertificate")
  @js.native
  open class ShaCertificate ()
    extends typingsJapgolly.firebaseAdmin.libProjectManagementAndroidAppMod.ShaCertificate
  
  inline def getProjectManagement(): typingsJapgolly.firebaseAdmin.libProjectManagementProjectManagementMod.ProjectManagement = ^.asInstanceOf[js.Dynamic].applyDynamic("getProjectManagement")().asInstanceOf[typingsJapgolly.firebaseAdmin.libProjectManagementProjectManagementMod.ProjectManagement]
  inline def getProjectManagement(app: App): typingsJapgolly.firebaseAdmin.libProjectManagementProjectManagementMod.ProjectManagement = ^.asInstanceOf[js.Dynamic].applyDynamic("getProjectManagement")(app.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAdmin.libProjectManagementProjectManagementMod.ProjectManagement]
}
