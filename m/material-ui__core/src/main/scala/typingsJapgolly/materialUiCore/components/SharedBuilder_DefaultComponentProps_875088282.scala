package typingsJapgolly.materialUiCore.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.ClassNameMap
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_DefaultComponentProps_875088282 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def classes(
    value: Partial[
      ClassNameMap[
        /* import warning: importer.ImportType#apply Failed type conversion: M['classKey'] */ js.Any
      ]
    ]
  ): this.type = set("classes", value.asInstanceOf[js.Any])
  
  inline def innerRef(value: Ref[Any]): this.type = set("innerRef", value.asInstanceOf[js.Any])
  
  inline def innerRefFunction1(value: Any | Null => Callback): this.type = set("innerRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
  
  inline def innerRefNull: this.type = set("innerRef", null)
  
  inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
}
