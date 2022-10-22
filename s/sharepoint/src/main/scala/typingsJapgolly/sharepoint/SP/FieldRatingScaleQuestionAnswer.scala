package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldRatingScaleQuestionAnswer
  extends StObject
     with ClientValueObject {
  
  def get_answer(): Double
  
  def get_question(): String
  
  def set_answer(value: Double): Unit
  
  def set_question(value: String): Unit
}
object FieldRatingScaleQuestionAnswer {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_answer: CallbackTo[Double],
    get_question: CallbackTo[String],
    get_typeId: CallbackTo[String],
    set_answer: Double => Callback,
    set_question: String => Callback,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): FieldRatingScaleQuestionAnswer = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_answer = get_answer.toJsFn, get_question = get_question.toJsFn, get_typeId = get_typeId.toJsFn, set_answer = js.Any.fromFunction1((t0: Double) => set_answer(t0).runNow()), set_question = js.Any.fromFunction1((t0: String) => set_question(t0).runNow()), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[FieldRatingScaleQuestionAnswer]
  }
  
  extension [Self <: FieldRatingScaleQuestionAnswer](x: Self) {
    
    inline def setGet_answer(value: CallbackTo[Double]): Self = StObject.set(x, "get_answer", value.toJsFn)
    
    inline def setGet_question(value: CallbackTo[String]): Self = StObject.set(x, "get_question", value.toJsFn)
    
    inline def setSet_answer(value: Double => Callback): Self = StObject.set(x, "set_answer", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSet_question(value: String => Callback): Self = StObject.set(x, "set_question", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
