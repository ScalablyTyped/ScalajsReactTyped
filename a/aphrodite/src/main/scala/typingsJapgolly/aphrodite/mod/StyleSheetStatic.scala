package typingsJapgolly.aphrodite.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleSheetStatic extends js.Object {
  /**
    * Create style sheet
    */
  def create[T](styles: StyleDeclaration[T]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: aphrodite.aphrodite.StyleDeclarationValue}
    */ typingsJapgolly.aphrodite.aphroditeStrings.StyleSheetStatic with js.Any
  def extend(extensions: js.Array[Extension]): Exports
  /**
    * Rehydrate class names from server renderer
    */
  def rehydrate(renderedClassNames: js.Array[String]): Unit
}

object StyleSheetStatic {
  @scala.inline
  def apply(
    create: StyleDeclaration[js.Any] => CallbackTo[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: aphrodite.aphrodite.StyleDeclarationValue}
    */ typingsJapgolly.aphrodite.aphroditeStrings.StyleSheetStatic with js.Any
    ],
    extend: js.Array[Extension] => CallbackTo[Exports],
    rehydrate: js.Array[String] => Callback
  ): StyleSheetStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.aphrodite.mod.StyleDeclaration[js.Any]) => create(t0).runNow()))
    __obj.updateDynamic("extend")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.aphrodite.mod.Extension]) => extend(t0).runNow()))
    __obj.updateDynamic("rehydrate")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => rehydrate(t0).runNow()))
    __obj.asInstanceOf[StyleSheetStatic]
  }
}

