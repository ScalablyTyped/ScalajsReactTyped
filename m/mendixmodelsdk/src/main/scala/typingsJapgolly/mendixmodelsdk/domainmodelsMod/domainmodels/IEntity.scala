package typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.elementsMod.IByNameReferrable
import typingsJapgolly.mendixmodelsdk.elementsMod.IElement
import typingsJapgolly.mendixmodelsdk.instancesMod.IList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/entities relevant section in reference guide}
  */
@js.native
trait IEntity
  extends IElement
     with IByNameReferrable {
  val attributes: IList[IAttribute] = js.native
  val containerAsDomainModel: IDomainModel = js.native
  /**
    * This property is required and cannot be set to null.
    */
  val generalization: IGeneralizationBase = js.native
  /**
    * In version 8.2.0: added public
    * In version 7.17.0: introduced
    */
  val isRemote: Boolean = js.native
  @JSName("model")
  val model_IEntity: IModel = js.native
  val name: String = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.2.0: introduced
    */
  val remoteSourceDocument: IRemoteEntitySourceDocument | Null = js.native
  val remoteSourceDocumentQualifiedName: String | Null = js.native
}

