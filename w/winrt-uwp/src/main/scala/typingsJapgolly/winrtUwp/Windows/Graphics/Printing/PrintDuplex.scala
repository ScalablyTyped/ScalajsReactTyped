package typingsJapgolly.winrtUwp.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrintDuplex extends StObject
/** Specifies the duplex option. */
@JSGlobal("Windows.Graphics.Printing.PrintDuplex")
@js.native
object PrintDuplex extends StObject {
  
  /** The default duplex option. */
  @js.native
  sealed trait default
    extends StObject
       with PrintDuplex
  
  /** An unsupported duplex option. */
  @js.native
  sealed trait notAvailable
    extends StObject
       with PrintDuplex
  
  /** The option to print on only one side of the sheet. */
  @js.native
  sealed trait oneSided
    extends StObject
       with PrintDuplex
  
  /** A custom duplex option that is specific to the print device. */
  @js.native
  sealed trait printerCustom
    extends StObject
       with PrintDuplex
  
  /** The option to print on both sides of the sheet, flipped along the long edge. */
  @js.native
  sealed trait twoSidedLongEdge
    extends StObject
       with PrintDuplex
  
  /** The option to print on both sides of the sheet, flipped along the short edge. */
  @js.native
  sealed trait twoSidedShortEdge
    extends StObject
       with PrintDuplex
}
