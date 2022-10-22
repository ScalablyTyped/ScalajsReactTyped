package typingsJapgolly.ace.AceAjax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////
/// Document
////////////////
/**
  * Contains the text of the document. Document can be attached to several [[EditSession `EditSession`]]s.
  * At its core, `Document`s are just an array of strings, with each row in the document matching up to the array index.
  **/
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ace.aceStrings.auto
  - typingsJapgolly.ace.aceStrings.unix
  - typingsJapgolly.ace.aceStrings.windows
*/
trait NewLineMode extends StObject
object NewLineMode {
  
  inline def auto: typingsJapgolly.ace.aceStrings.auto = "auto".asInstanceOf[typingsJapgolly.ace.aceStrings.auto]
  
  inline def unix: typingsJapgolly.ace.aceStrings.unix = "unix".asInstanceOf[typingsJapgolly.ace.aceStrings.unix]
  
  inline def windows: typingsJapgolly.ace.aceStrings.windows = "windows".asInstanceOf[typingsJapgolly.ace.aceStrings.windows]
}
