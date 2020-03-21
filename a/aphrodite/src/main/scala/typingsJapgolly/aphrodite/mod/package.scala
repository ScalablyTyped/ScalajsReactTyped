package typingsJapgolly.aphrodite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CSSInputTypes = typingsJapgolly.aphrodite.mod.StyleDeclarationValue | typingsJapgolly.aphrodite.aphroditeBooleans.`false` | scala.Null | scala.Unit
  type SelectorHandler = js.Function3[
    /* selector */ java.lang.String, 
    /* baseSelector */ java.lang.String, 
    /* callback */ js.Function1[/* selector */ java.lang.String, java.lang.String], 
    java.lang.String | scala.Null
  ]
  type StyleDeclaration[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: aphrodite.aphrodite/typings/css-properties.CSSProperties | aphrodite.aphrodite.StyleDeclarationMap}
    */ typingsJapgolly.aphrodite.aphroditeStrings.StyleDeclaration with js.Any
  type StyleDeclarationMap = typingsJapgolly.std.Map[java.lang.String, java.lang.String | scala.Double]
  type StyleDeclarationValue = js.Object
}
