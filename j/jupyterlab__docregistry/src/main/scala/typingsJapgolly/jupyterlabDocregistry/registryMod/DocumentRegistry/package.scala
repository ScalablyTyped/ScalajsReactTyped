package typingsJapgolly.jupyterlabDocregistry.registryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DocumentRegistry {
  /**
    * A type alias for a code context.
    */
  type CodeContext = typingsJapgolly.jupyterlabDocregistry.registryMod.DocumentRegistry.IContext[typingsJapgolly.jupyterlabDocregistry.registryMod.DocumentRegistry.ICodeModel]
  /**
    * A type alias for a code model factory.
    */
  type CodeModelFactory = typingsJapgolly.jupyterlabDocregistry.registryMod.DocumentRegistry.IModelFactory[typingsJapgolly.jupyterlabDocregistry.registryMod.DocumentRegistry.ICodeModel]
  /**
    * A type alias for a context.
    */
  type Context = typingsJapgolly.jupyterlabDocregistry.registryMod.DocumentRegistry.IContext[typingsJapgolly.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel]
  /**
    * A type alias for a standard model factory.
    */
  type ModelFactory = typingsJapgolly.jupyterlabDocregistry.registryMod.DocumentRegistry.IModelFactory[typingsJapgolly.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel]
  /**
    * A type alias for a standard widget extension.
    */
  type WidgetExtension = typingsJapgolly.jupyterlabDocregistry.registryMod.DocumentRegistry.IWidgetExtension[
    typingsJapgolly.phosphorWidgets.mod.Widget, 
    typingsJapgolly.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
  ]
  /**
    * A type alias for a standard widget factory.
    */
  type WidgetFactory = typingsJapgolly.jupyterlabDocregistry.registryMod.DocumentRegistry.IWidgetFactory[
    typingsJapgolly.jupyterlabDocregistry.registryMod.IDocumentWidget[
      typingsJapgolly.phosphorWidgets.mod.Widget, 
      typingsJapgolly.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
    ], 
    typingsJapgolly.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
  ]
}
