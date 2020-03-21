package typingsJapgolly.mendixmodelsdk.allModelClassesMod

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javascriptactions")
@js.native
object javascriptactions extends js.Object {
  /**
    * See: {@link https://docs.mendix.com/refguide7/javascript-actions relevant section in reference guide}
    *
    * In version 8.0.0: removed experimental
    * In version 7.21.0: introduced
    */
  @js.native
  class JavaScriptAction protected ()
    extends typingsJapgolly.mendixmodelsdk.javascriptactionsMod.javascriptactions.JavaScriptAction {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  /**
    * In version 8.0.0: removed experimental
    * In version 7.21.0: introduced
    */
  @js.native
  class JavaScriptActionParameter protected ()
    extends typingsJapgolly.mendixmodelsdk.javascriptactionsMod.javascriptactions.JavaScriptActionParameter {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  /**
    * In version 8.4.0: introduced
    */
  @js.native
  class NanoflowJavaScriptActionParameterType protected ()
    extends typingsJapgolly.mendixmodelsdk.javascriptactionsMod.javascriptactions.NanoflowJavaScriptActionParameterType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  /* static members */
  @js.native
  object JavaScriptAction extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsJapgolly.mendixmodelsdk.javascriptactionsMod.StructureVersionInfo = js.native
    /**
      * Creates a new JavaScriptAction unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): typingsJapgolly.mendixmodelsdk.javascriptactionsMod.javascriptactions.JavaScriptAction = js.native
  }
  
  /* static members */
  @js.native
  object JavaScriptActionParameter extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsJapgolly.mendixmodelsdk.javascriptactionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new JavaScriptActionParameter instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsJapgolly.mendixmodelsdk.javascriptactionsMod.javascriptactions.JavaScriptActionParameter = js.native
  }
  
  /* static members */
  @js.native
  object NanoflowJavaScriptActionParameterType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsJapgolly.mendixmodelsdk.javascriptactionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new NanoflowJavaScriptActionParameterType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsJapgolly.mendixmodelsdk.javascriptactionsMod.javascriptactions.NanoflowJavaScriptActionParameterType = js.native
  }
  
}

