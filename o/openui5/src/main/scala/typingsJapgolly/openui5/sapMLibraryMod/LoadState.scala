package typingsJapgolly.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LoadState extends StObject
@JSImport("sap/m/library", "LoadState")
@js.native
object LoadState extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[LoadState & String] = js.native
  
  /**
    * The control is disabled.
    */
  @js.native
  sealed trait Disabled
    extends StObject
       with LoadState
  /* "Disabled" */ val Disabled: typingsJapgolly.openui5.sapMLibraryMod.LoadState.Disabled & String = js.native
  
  /**
    * The control failed to load.
    */
  @js.native
  sealed trait Failed
    extends StObject
       with LoadState
  /* "Failed" */ val Failed: typingsJapgolly.openui5.sapMLibraryMod.LoadState.Failed & String = js.native
  
  /**
    * The control has loaded.
    */
  @js.native
  sealed trait Loaded
    extends StObject
       with LoadState
  /* "Loaded" */ val Loaded: typingsJapgolly.openui5.sapMLibraryMod.LoadState.Loaded & String = js.native
  
  /**
    * The control is loading.
    */
  @js.native
  sealed trait Loading
    extends StObject
       with LoadState
  /* "Loading" */ val Loading: typingsJapgolly.openui5.sapMLibraryMod.LoadState.Loading & String = js.native
}
