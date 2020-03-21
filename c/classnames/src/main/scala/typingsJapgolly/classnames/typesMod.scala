package typingsJapgolly.classnames

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("classnames/types", JSImport.Namespace)
@js.native
object typesMod extends js.Object {
  @js.native
  trait ClassArray extends Array[ClassValue]
  
  type ClassDictionary = StringDictionary[js.Any]
  type ClassNamesExport = ClassNamesFn with AnonDefaultClassNamesFn
  type ClassNamesFn = js.Function1[/* repeated */ ClassValue, String]
  type ClassValue = js.UndefOr[String | Double | ClassDictionary | ClassArray | Null | Boolean]
}

