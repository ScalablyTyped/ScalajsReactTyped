package typingsJapgolly.nodeRedEditorClient.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextBidi extends StObject {
  
  /**
    * Enforces the text direction of a given string by adding
    * UCC (Unicode Control Characters)
    * @param value - the string
    */
  def enforceTextDirectionWithUCC(value: String): String
  
  /**
    * Adds event listeners to the Input to ensure its text-direction attribute
    * is properly set based on its content.
    * @param input - the input field
    */
  def prepareInput(input: HTMLInputElement): Unit
  
  /**
    * Determines the text direction of a given string.
    * @param value - the string
    */
  def resolveBaseTextDir(value: String): String
  
  /**
    * Sets the text direction preference
    * @param dir - the text direction preference
    */
  def setTextDirection(dir: String): Unit
}
object TextBidi {
  
  inline def apply(
    enforceTextDirectionWithUCC: String => String,
    prepareInput: HTMLInputElement => Callback,
    resolveBaseTextDir: String => String,
    setTextDirection: String => Callback
  ): TextBidi = {
    val __obj = js.Dynamic.literal(enforceTextDirectionWithUCC = js.Any.fromFunction1(enforceTextDirectionWithUCC), prepareInput = js.Any.fromFunction1((t0: HTMLInputElement) => prepareInput(t0).runNow()), resolveBaseTextDir = js.Any.fromFunction1(resolveBaseTextDir), setTextDirection = js.Any.fromFunction1((t0: String) => setTextDirection(t0).runNow()))
    __obj.asInstanceOf[TextBidi]
  }
  
  extension [Self <: TextBidi](x: Self) {
    
    inline def setEnforceTextDirectionWithUCC(value: String => String): Self = StObject.set(x, "enforceTextDirectionWithUCC", js.Any.fromFunction1(value))
    
    inline def setPrepareInput(value: HTMLInputElement => Callback): Self = StObject.set(x, "prepareInput", js.Any.fromFunction1((t0: HTMLInputElement) => value(t0).runNow()))
    
    inline def setResolveBaseTextDir(value: String => String): Self = StObject.set(x, "resolveBaseTextDir", js.Any.fromFunction1(value))
    
    inline def setSetTextDirection(value: String => Callback): Self = StObject.set(x, "setTextDirection", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
