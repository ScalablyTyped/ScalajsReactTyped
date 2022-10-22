package typingsJapgolly.cordovaPluginDeviceOrientation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("CompassError")
  @js.native
  open class CompassError protected ()
    extends StObject
       with typingsJapgolly.cordovaPluginDeviceOrientation.CompassError {
    /** Constructor for CompassError object */
    def this(code: Double) = this()
    
    /**
      * One of the predefined error codes
      *     CompassError.COMPASS_INTERNAL_ERR
      *     CompassError.COMPASS_NOT_SUPPORTED
      */
    /* CompleteClass */
    var code: Double = js.native
  }
  object CompassError {
    
    @JSGlobal("CompassError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("CompassError.COMPASS_INTERNAL_ERR")
    @js.native
    def COMPASS_INTERNAL_ERR: Double = js.native
    inline def COMPASS_INTERNAL_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COMPASS_INTERNAL_ERR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("CompassError.COMPASS_NOT_SUPPORTED")
    @js.native
    def COMPASS_NOT_SUPPORTED: Double = js.native
    inline def COMPASS_NOT_SUPPORTED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COMPASS_NOT_SUPPORTED")(x.asInstanceOf[js.Any])
  }
}
