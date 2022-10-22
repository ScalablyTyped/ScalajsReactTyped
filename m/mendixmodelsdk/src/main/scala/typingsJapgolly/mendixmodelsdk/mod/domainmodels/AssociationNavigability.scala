package typingsJapgolly.mendixmodelsdk.mod.domainmodels

import typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "domainmodels.AssociationNavigability")
@js.native
open class AssociationNavigability protected ()
  extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.domainmodels.AssociationNavigability {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object AssociationNavigability {
  
  @JSImport("mendixmodelsdk", "domainmodels.AssociationNavigability")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.AssociationNavigability.BothDirections")
  @js.native
  def BothDirections: typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AssociationNavigability = js.native
  inline def BothDirections_=(x: typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AssociationNavigability): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BothDirections")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.AssociationNavigability.ChildToParent")
  @js.native
  def ChildToParent: typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AssociationNavigability = js.native
  inline def ChildToParent_=(x: typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AssociationNavigability): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ChildToParent")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.AssociationNavigability.ParentToChild")
  @js.native
  def ParentToChild: typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AssociationNavigability = js.native
  inline def ParentToChild_=(x: typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AssociationNavigability): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ParentToChild")(x.asInstanceOf[js.Any])
}
