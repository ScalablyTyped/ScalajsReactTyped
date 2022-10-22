package typingsJapgolly.mendixmodelsdk.mod.domainmodels

import typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "domainmodels.Navigability")
@js.native
open class Navigability protected ()
  extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.domainmodels.Navigability {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object Navigability {
  
  @JSImport("mendixmodelsdk", "domainmodels.Navigability")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.Navigability.BothDirections")
  @js.native
  def BothDirections: typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.Navigability = js.native
  inline def BothDirections_=(x: typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.Navigability): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BothDirections")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.Navigability.ParentToChild")
  @js.native
  def ParentToChild: typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.Navigability = js.native
  inline def ParentToChild_=(x: typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.Navigability): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ParentToChild")(x.asInstanceOf[js.Any])
}
