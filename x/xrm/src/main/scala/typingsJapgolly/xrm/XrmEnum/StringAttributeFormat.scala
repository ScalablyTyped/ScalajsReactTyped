package typingsJapgolly.xrm.XrmEnum

import typingsJapgolly.xrm.xrmStrings.email
import typingsJapgolly.xrm.xrmStrings.phone
import typingsJapgolly.xrm.xrmStrings.text
import typingsJapgolly.xrm.xrmStrings.textarea
import typingsJapgolly.xrm.xrmStrings.tickersymbol
import typingsJapgolly.xrm.xrmStrings.url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Constant Enum: String attribute formats for Attributes.Attribute.getFormat(), used by {@link Attributes.StringAttribute StringAttribute}.
  * @see {@link Xrm.Attributes.StringAttributeFormat}
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.xrm.xrmStrings.email
  - typingsJapgolly.xrm.xrmStrings.phone
  - typingsJapgolly.xrm.xrmStrings.text
  - typingsJapgolly.xrm.xrmStrings.textarea
  - typingsJapgolly.xrm.xrmStrings.tickersymbol
  - typingsJapgolly.xrm.xrmStrings.url
*/
trait StringAttributeFormat extends StObject
object StringAttributeFormat {
  
  inline def Email: email = "email".asInstanceOf[email]
  
  inline def Phone: phone = "phone".asInstanceOf[phone]
  
  inline def Text: text = "text".asInstanceOf[text]
  
  inline def TextArea: textarea = "textarea".asInstanceOf[textarea]
  
  inline def TickerSymbol: tickersymbol = "tickersymbol".asInstanceOf[tickersymbol]
  
  inline def URL: url = "url".asInstanceOf[url]
}
