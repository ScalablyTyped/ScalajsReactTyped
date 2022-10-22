package typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.sendgrid.anon.Cc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Personalization extends StObject {
  
  def addBcc(email: Email): Unit
  
  def addCc(email: Email): Unit
  
  def addCustomArg(substitution: CustomArgs): Unit
  
  def addHeader(header: Header): Unit
  
  def addSubstitution(substitution: Substitution): Unit
  
  def addTo(email: Email): Unit
  
  def getBccs(): js.Array[Email]
  
  def getCcs(): js.Array[Email]
  
  def getCustomArgs(): js.Array[CustomArgs]
  
  def getHeaders(): js.Array[Header]
  
  def getSendAt(): Double
  
  def getSubject(): String
  
  def getSubstitutions(): StringDictionary[String]
  
  def getTos(): js.Array[Email]
  
  def setSendAt(sendAt: Double): Unit
  
  def setSubject(subject: String): Unit
  
  def toJSON(): Cc
}
object Personalization {
  
  inline def apply(
    addBcc: Email => Callback,
    addCc: Email => Callback,
    addCustomArg: CustomArgs => Callback,
    addHeader: Header => Callback,
    addSubstitution: Substitution => Callback,
    addTo: Email => Callback,
    getBccs: CallbackTo[js.Array[Email]],
    getCcs: CallbackTo[js.Array[Email]],
    getCustomArgs: CallbackTo[js.Array[CustomArgs]],
    getHeaders: CallbackTo[js.Array[Header]],
    getSendAt: CallbackTo[Double],
    getSubject: CallbackTo[String],
    getSubstitutions: CallbackTo[StringDictionary[String]],
    getTos: CallbackTo[js.Array[Email]],
    setSendAt: Double => Callback,
    setSubject: String => Callback,
    toJSON: CallbackTo[Cc]
  ): Personalization = {
    val __obj = js.Dynamic.literal(addBcc = js.Any.fromFunction1((t0: Email) => addBcc(t0).runNow()), addCc = js.Any.fromFunction1((t0: Email) => addCc(t0).runNow()), addCustomArg = js.Any.fromFunction1((t0: CustomArgs) => addCustomArg(t0).runNow()), addHeader = js.Any.fromFunction1((t0: Header) => addHeader(t0).runNow()), addSubstitution = js.Any.fromFunction1((t0: Substitution) => addSubstitution(t0).runNow()), addTo = js.Any.fromFunction1((t0: Email) => addTo(t0).runNow()), getBccs = getBccs.toJsFn, getCcs = getCcs.toJsFn, getCustomArgs = getCustomArgs.toJsFn, getHeaders = getHeaders.toJsFn, getSendAt = getSendAt.toJsFn, getSubject = getSubject.toJsFn, getSubstitutions = getSubstitutions.toJsFn, getTos = getTos.toJsFn, setSendAt = js.Any.fromFunction1((t0: Double) => setSendAt(t0).runNow()), setSubject = js.Any.fromFunction1((t0: String) => setSubject(t0).runNow()), toJSON = toJSON.toJsFn)
    __obj.asInstanceOf[Personalization]
  }
  
  extension [Self <: Personalization](x: Self) {
    
    inline def setAddBcc(value: Email => Callback): Self = StObject.set(x, "addBcc", js.Any.fromFunction1((t0: Email) => value(t0).runNow()))
    
    inline def setAddCc(value: Email => Callback): Self = StObject.set(x, "addCc", js.Any.fromFunction1((t0: Email) => value(t0).runNow()))
    
    inline def setAddCustomArg(value: CustomArgs => Callback): Self = StObject.set(x, "addCustomArg", js.Any.fromFunction1((t0: CustomArgs) => value(t0).runNow()))
    
    inline def setAddHeader(value: Header => Callback): Self = StObject.set(x, "addHeader", js.Any.fromFunction1((t0: Header) => value(t0).runNow()))
    
    inline def setAddSubstitution(value: Substitution => Callback): Self = StObject.set(x, "addSubstitution", js.Any.fromFunction1((t0: Substitution) => value(t0).runNow()))
    
    inline def setAddTo(value: Email => Callback): Self = StObject.set(x, "addTo", js.Any.fromFunction1((t0: Email) => value(t0).runNow()))
    
    inline def setGetBccs(value: CallbackTo[js.Array[Email]]): Self = StObject.set(x, "getBccs", value.toJsFn)
    
    inline def setGetCcs(value: CallbackTo[js.Array[Email]]): Self = StObject.set(x, "getCcs", value.toJsFn)
    
    inline def setGetCustomArgs(value: CallbackTo[js.Array[CustomArgs]]): Self = StObject.set(x, "getCustomArgs", value.toJsFn)
    
    inline def setGetHeaders(value: CallbackTo[js.Array[Header]]): Self = StObject.set(x, "getHeaders", value.toJsFn)
    
    inline def setGetSendAt(value: CallbackTo[Double]): Self = StObject.set(x, "getSendAt", value.toJsFn)
    
    inline def setGetSubject(value: CallbackTo[String]): Self = StObject.set(x, "getSubject", value.toJsFn)
    
    inline def setGetSubstitutions(value: CallbackTo[StringDictionary[String]]): Self = StObject.set(x, "getSubstitutions", value.toJsFn)
    
    inline def setGetTos(value: CallbackTo[js.Array[Email]]): Self = StObject.set(x, "getTos", value.toJsFn)
    
    inline def setSetSendAt(value: Double => Callback): Self = StObject.set(x, "setSendAt", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetSubject(value: String => Callback): Self = StObject.set(x, "setSubject", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setToJSON(value: CallbackTo[Cc]): Self = StObject.set(x, "toJSON", value.toJsFn)
  }
}
