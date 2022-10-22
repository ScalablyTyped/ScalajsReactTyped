package typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an immutable snapshot of a script at a specified time.Once acquired, the
  * snapshot is observably immutable. i.e. the same calls with the same parameters will return
  * the same values.
  */
trait IScriptSnapshot extends StObject {
  
  /** Releases all resources held by this script snapshot */
  var dispose: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Gets the TextChangeRange that describe how the text changed between this text and
    * an older version.  This information is used by the incremental parser to determine
    * what sections of the script need to be re-parsed.  'undefined' can be returned if the
    * change range cannot be determined.  However, in that case, incremental parsing will
    * not happen and the entire document will be re - parsed.
    */
  def getChangeRange(oldSnapshot: IScriptSnapshot): js.UndefOr[TextChangeRange]
  
  /** Gets the length of this script snapshot. */
  def getLength(): Double
  
  /** Gets a portion of the script snapshot specified by [start, end). */
  def getText(start: Double, end: Double): java.lang.String
}
object IScriptSnapshot {
  
  inline def apply(
    getChangeRange: IScriptSnapshot => js.UndefOr[TextChangeRange],
    getLength: CallbackTo[Double],
    getText: (Double, Double) => java.lang.String
  ): IScriptSnapshot = {
    val __obj = js.Dynamic.literal(getChangeRange = js.Any.fromFunction1(getChangeRange), getLength = getLength.toJsFn, getText = js.Any.fromFunction2(getText))
    __obj.asInstanceOf[IScriptSnapshot]
  }
  
  extension [Self <: IScriptSnapshot](x: Self) {
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    
    inline def setDisposeUndefined: Self = StObject.set(x, "dispose", js.undefined)
    
    inline def setGetChangeRange(value: IScriptSnapshot => js.UndefOr[TextChangeRange]): Self = StObject.set(x, "getChangeRange", js.Any.fromFunction1(value))
    
    inline def setGetLength(value: CallbackTo[Double]): Self = StObject.set(x, "getLength", value.toJsFn)
    
    inline def setGetText(value: (Double, Double) => java.lang.String): Self = StObject.set(x, "getText", js.Any.fromFunction2(value))
  }
}
