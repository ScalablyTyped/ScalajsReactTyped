package typingsJapgolly.googleMaps.google.maps.localContext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlaceChooserLayoutMode extends StObject
/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  * Layout modes for the place chooser.
  */
@JSGlobal("google.maps.localContext.PlaceChooserLayoutMode")
@js.native
object PlaceChooserLayoutMode extends StObject {
  
  /**
    * Place chooser is hidden.
    */
  @js.native
  sealed trait HIDDEN
    extends StObject
       with PlaceChooserLayoutMode
  
  /**
    * Place chooser is shown as a sheet.
    */
  @js.native
  sealed trait SHEET
    extends StObject
       with PlaceChooserLayoutMode
}
