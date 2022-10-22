package typingsJapgolly.reactMdForm

import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLSelectElement
import typingsJapgolly.react.mod.Dispatch
import typingsJapgolly.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUseChoiceMod {
  
  @JSImport("@react-md/form/types/useChoice", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useChoice[E /* <: InputElement */](defaultValue: String): js.Tuple3[String, ChangeEventHandler[E], SetValue[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useChoice")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[String, ChangeEventHandler[E], SetValue[String]]]
  inline def useChoice[E /* <: InputElement */](defaultValue: String, onChange: ChangeEventHandler[E]): js.Tuple3[String, ChangeEventHandler[E], SetValue[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useChoice")(defaultValue.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[String, ChangeEventHandler[E], SetValue[String]]]
  inline def useChoice[E /* <: InputElement */](defaultValue: js.Array[String]): js.Tuple3[js.Array[String], ChangeEventHandler[E], SetValue[js.Array[String]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useChoice")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[js.Array[String], ChangeEventHandler[E], SetValue[js.Array[String]]]]
  inline def useChoice[E /* <: InputElement */](defaultValue: js.Array[String], onChange: ChangeEventHandler[E]): js.Tuple3[js.Array[String], ChangeEventHandler[E], SetValue[js.Array[String]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useChoice")(defaultValue.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[js.Array[String], ChangeEventHandler[E], SetValue[js.Array[String]]]]
  inline def useChoice[E /* <: InputElement */](defaultValue: Double): js.Tuple3[Double, ChangeEventHandler[E], SetValue[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useChoice")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[Double, ChangeEventHandler[E], SetValue[Double]]]
  inline def useChoice[E /* <: InputElement */](defaultValue: Double, onChange: ChangeEventHandler[E]): js.Tuple3[Double, ChangeEventHandler[E], SetValue[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useChoice")(defaultValue.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Double, ChangeEventHandler[E], SetValue[Double]]]
  inline def useChoice[T /* <: js.Function0[String | Double | js.Array[String]] */, E /* <: InputElement */](defaultValue: T): js.Tuple3[T, ChangeEventHandler[E], SetValue[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useChoice")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[T, ChangeEventHandler[E], SetValue[T]]]
  inline def useChoice[T /* <: js.Function0[String | Double | js.Array[String]] */, E /* <: InputElement */](defaultValue: T, onChange: ChangeEventHandler[E]): js.Tuple3[T, ChangeEventHandler[E], SetValue[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useChoice")(defaultValue.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[T, ChangeEventHandler[E], SetValue[T]]]
  
  type ChangeEventHandler[E /* <: InputElement */] = typingsJapgolly.react.mod.ChangeEventHandler[E]
  
  type DefaultValue = String | Double | js.Array[String] | (js.Function0[String | Double | js.Array[String]])
  
  type InputElement = HTMLInputElement | HTMLSelectElement
  
  type SetValue[T /* <: DefaultValue */] = Dispatch[SetStateAction[T]]
}
