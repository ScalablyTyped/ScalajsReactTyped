package typingsJapgolly.winrtUwp.global.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the set of identifiers for the character sets that a point-of-service printer can use. */
/* note: abstract class */ @JSGlobal("Windows.Devices.PointOfService.PosPrinterCharacterSetIds")
@js.native
open class PosPrinterCharacterSetIds ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Devices.PointOfService.PosPrinterCharacterSetIds
object PosPrinterCharacterSetIds {
  
  @JSGlobal("Windows.Devices.PointOfService.PosPrinterCharacterSetIds")
  @js.native
  val ^ : js.Any = js.native
  
  /** Gets the identifier for the ANSI character set. */
  /* static member */
  @JSGlobal("Windows.Devices.PointOfService.PosPrinterCharacterSetIds.ansi")
  @js.native
  def ansi: Double = js.native
  inline def ansi_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ansi")(x.asInstanceOf[js.Any])
  
  /** Gets the identifier for the ASCII character set. */
  /* static member */
  @JSGlobal("Windows.Devices.PointOfService.PosPrinterCharacterSetIds.ascii")
  @js.native
  def ascii: Double = js.native
  inline def ascii_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ascii")(x.asInstanceOf[js.Any])
  
  /** Gets the identifier for the UTF16LE character set. */
  /* static member */
  @JSGlobal("Windows.Devices.PointOfService.PosPrinterCharacterSetIds.utf16LE")
  @js.native
  def utf16LE: Double = js.native
  inline def utf16LE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("utf16LE")(x.asInstanceOf[js.Any])
}
