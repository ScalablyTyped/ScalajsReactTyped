package typingsJapgolly.meteorAstronomy

import typingsJapgolly.meteorAstronomy.MeteorAstronomy.ClassModel
import typingsJapgolly.meteorAstronomy.MeteorAstronomy.EnumModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/jagi:astronomy", JSImport.Namespace)
@js.native
object mod extends js.Object {
  // tslint:disable-line:no-single-declare-module
  @js.native
  object Class extends js.Object {
    def create[T /* <: js.Object */](model: ClassModel[T]): typingsJapgolly.meteorAstronomy.MeteorAstronomy.Class[T] = js.native
  }
  
  @js.native
  object Enum extends js.Object {
    def create[T](model: EnumModel[T]): typingsJapgolly.meteorAstronomy.MeteorAstronomy.Enum[T] = js.native
  }
  
}

