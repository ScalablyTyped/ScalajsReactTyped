package typingsJapgolly.classnames

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.classnames.typesMod.ClassArray
import typingsJapgolly.classnames.typesMod.ClassDictionary
import typingsJapgolly.classnames.typesMod.ClassNamesFn
import typingsJapgolly.classnames.typesMod.ClassValue
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
  type ClassNamesExport = ClassNamesFn with Anon_DefaultClassNamesFn
  type ClassNamesFn = js.Function1[/* repeated */ ClassValue, String]
  type ClassValue = js.UndefOr[String | Double | ClassDictionary | ClassArray | Null | Boolean]
}

