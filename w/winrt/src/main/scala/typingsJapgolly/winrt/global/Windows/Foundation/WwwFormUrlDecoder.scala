package typingsJapgolly.winrt.global.Windows.Foundation

import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterator
import typingsJapgolly.winrt.Windows.Foundation.IWwwFormUrlDecoderEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Foundation.WwwFormUrlDecoder")
@js.native
open class WwwFormUrlDecoder protected ()
  extends StObject
     with typingsJapgolly.winrt.Windows.Foundation.WwwFormUrlDecoder {
  def this(query: String) = this()
  
  /* CompleteClass */
  override def first(): IIterator[IWwwFormUrlDecoderEntry] = js.native
}
