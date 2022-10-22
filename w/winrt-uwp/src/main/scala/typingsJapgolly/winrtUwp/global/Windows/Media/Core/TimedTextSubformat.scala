package typingsJapgolly.winrtUwp.global.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines a TimedTextStyle for a substring in a TimedTextLine . of the cue, which defines the style of the rendered text. */
@JSGlobal("Windows.Media.Core.TimedTextSubformat")
@js.native
/** Initializes a new instance of the TimedTextSubformat class. */
open class TimedTextSubformat ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Media.Core.TimedTextSubformat {
  
  /** Gets or sets the length of the substring to which the SubformatStyle applies. */
  /* CompleteClass */
  var length: Double = js.native
  
  /** Gets or sets the staring index of the substring to which the SubformatStyle applies. */
  /* CompleteClass */
  var startIndex: Double = js.native
  
  /** Gets or sets the TimedTextStyle object that conveys the formatting of a substring in a TimedTextLine . */
  /* CompleteClass */
  var subformatStyle: typingsJapgolly.winrtUwp.Windows.Media.Core.TimedTextStyle = js.native
}
