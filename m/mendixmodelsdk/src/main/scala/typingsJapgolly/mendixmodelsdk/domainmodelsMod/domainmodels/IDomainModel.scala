package typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels

import typingsJapgolly.mendixmodelsdk.instancesMod.IList
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.IModuleDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/domain-model relevant section in reference guide}
  */
@js.native
trait IDomainModel extends IModuleDocument {
  val associations: IList[IAssociation] = js.native
  val crossAssociations: IList[ICrossAssociation] = js.native
  val entities: IList[IEntity] = js.native
}

