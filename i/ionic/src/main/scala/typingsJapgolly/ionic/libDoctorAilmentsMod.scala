package typingsJapgolly.ionic

import typingsJapgolly.ionic.definitionsMod.IAilment
import typingsJapgolly.ionic.ionicStrings.`viewport-fit-not-set`
import typingsJapgolly.ionic.libDoctorAilmentsBaseMod.AilmentDeps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDoctorAilmentsMod {
  
  @JSImport("ionic/lib/doctor/ailments", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("ionic/lib/doctor/ailments", "Ailment")
  @js.native
  open class Ailment protected ()
    extends typingsJapgolly.ionic.libDoctorAilmentsBaseMod.Ailment {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
  }
  
  @JSImport("ionic/lib/doctor/ailments", "AilmentRegistry")
  @js.native
  open class AilmentRegistry ()
    extends typingsJapgolly.ionic.libDoctorAilmentsBaseMod.AilmentRegistry
  
  @JSImport("ionic/lib/doctor/ailments", "CordovaPlatformsCommitted")
  @js.native
  open class CordovaPlatformsCommitted protected ()
    extends typingsJapgolly.ionic.libDoctorAilmentsBaseMod.Ailment {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
  }
  
  @JSImport("ionic/lib/doctor/ailments", "DefaultCordovaBundleIdUsed")
  @js.native
  open class DefaultCordovaBundleIdUsed protected ()
    extends typingsJapgolly.ionic.libDoctorAilmentsBaseMod.Ailment {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
  }
  
  @JSImport("ionic/lib/doctor/ailments", "GitConfigInvalid")
  @js.native
  open class GitConfigInvalid protected ()
    extends typingsJapgolly.ionic.libDoctorAilmentsBaseMod.Ailment {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
  }
  
  @JSImport("ionic/lib/doctor/ailments", "GitNotUsed")
  @js.native
  open class GitNotUsed protected ()
    extends typingsJapgolly.ionic.libDoctorAilmentsBaseMod.Ailment {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.ionic.definitionsMod.IAilment because Already inherited
  - typingsJapgolly.ionic.definitionsMod.TreatableAilment because var conflicts: `implicit`, projects. Inlined treatable */ @JSImport("ionic/lib/doctor/ailments", "IonicCLIInstalledLocally")
  @js.native
  open class IonicCLIInstalledLocally protected ()
    extends typingsJapgolly.ionic.libDoctorAilmentsBaseMod.Ailment {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
    
    val treatable: /* true */ Boolean = js.native
  }
  
  @JSImport("ionic/lib/doctor/ailments", "IonicNativeOldVersionInstalled")
  @js.native
  open class IonicNativeOldVersionInstalled protected ()
    extends typingsJapgolly.ionic.libDoctorAilmentsBaseMod.Ailment {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.ionic.definitionsMod.IAilment because Already inherited
  - typingsJapgolly.ionic.definitionsMod.TreatableAilment because var conflicts: `implicit`, projects. Inlined treatable */ @JSImport("ionic/lib/doctor/ailments", "NpmInstalledLocally")
  @js.native
  open class NpmInstalledLocally protected ()
    extends typingsJapgolly.ionic.libDoctorAilmentsBaseMod.Ailment {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
    
    val treatable: /* true */ Boolean = js.native
  }
  
  @JSImport("ionic/lib/doctor/ailments", "UnsavedCordovaPlatforms")
  @js.native
  open class UnsavedCordovaPlatforms protected ()
    extends typingsJapgolly.ionic.libDoctorAilmentsBaseMod.Ailment {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
  }
  
  @JSImport("ionic/lib/doctor/ailments", "ViewportFitNotSet")
  @js.native
  open class ViewportFitNotSet protected ()
    extends typingsJapgolly.ionic.libDoctorAilmentsBaseMod.Ailment {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
    
    @JSName("id")
    val id_ViewportFitNotSet: `viewport-fit-not-set` = js.native
  }
  
  inline def formatAilmentMessage(ailment: IAilment): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("formatAilmentMessage")(ailment.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
}
