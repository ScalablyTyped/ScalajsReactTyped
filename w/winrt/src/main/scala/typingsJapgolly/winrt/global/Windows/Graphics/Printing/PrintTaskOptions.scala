package typingsJapgolly.winrt.global.Windows.Graphics.Printing

import typingsJapgolly.winrt.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrt.Windows.Graphics.Printing.PrintPageDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Graphics.Printing.PrintTaskOptions")
@js.native
open class PrintTaskOptions ()
  extends StObject
     with typingsJapgolly.winrt.Windows.Graphics.Printing.PrintTaskOptions {
  
  /* CompleteClass */
  var binding: typingsJapgolly.winrt.Windows.Graphics.Printing.PrintBinding = js.native
  
  /* CompleteClass */
  var collation: typingsJapgolly.winrt.Windows.Graphics.Printing.PrintCollation = js.native
  
  /* CompleteClass */
  var colorMode: typingsJapgolly.winrt.Windows.Graphics.Printing.PrintColorMode = js.native
  
  /* CompleteClass */
  var displayedOptions: IVector[String] = js.native
  
  /* CompleteClass */
  var duplex: typingsJapgolly.winrt.Windows.Graphics.Printing.PrintDuplex = js.native
  
  /* CompleteClass */
  override def getPageDescription(jobPageNumber: Double): PrintPageDescription = js.native
  
  /* CompleteClass */
  var holePunch: typingsJapgolly.winrt.Windows.Graphics.Printing.PrintHolePunch = js.native
  
  /* CompleteClass */
  var maxCopies: Double = js.native
  
  /* CompleteClass */
  var mediaSize: typingsJapgolly.winrt.Windows.Graphics.Printing.PrintMediaSize = js.native
  
  /* CompleteClass */
  var mediaType: typingsJapgolly.winrt.Windows.Graphics.Printing.PrintMediaType = js.native
  
  /* CompleteClass */
  var minCopies: Double = js.native
  
  /* CompleteClass */
  var numberOfCopies: Double = js.native
  
  /* CompleteClass */
  var orientation: typingsJapgolly.winrt.Windows.Graphics.Printing.PrintOrientation = js.native
  
  /* CompleteClass */
  var printQuality: typingsJapgolly.winrt.Windows.Graphics.Printing.PrintQuality = js.native
  
  /* CompleteClass */
  var staple: typingsJapgolly.winrt.Windows.Graphics.Printing.PrintStaple = js.native
}
