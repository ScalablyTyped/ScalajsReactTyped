package typingsJapgolly.winrtUwp.global.Windows.Networking.NetworkOperators

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Static class that provides known RUIM file paths. */
/* note: abstract class */ @JSGlobal("Windows.Networking.NetworkOperators.KnownRuimFilePaths")
@js.native
open class KnownRuimFilePaths ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.KnownRuimFilePaths
object KnownRuimFilePaths {
  
  @JSGlobal("Windows.Networking.NetworkOperators.KnownRuimFilePaths")
  @js.native
  val ^ : js.Any = js.native
  
  /** Static property that gets the EFSPN path. */
  /* static member */
  @JSGlobal("Windows.Networking.NetworkOperators.KnownRuimFilePaths.efSpn")
  @js.native
  def efSpn: IVectorView[Double] = js.native
  inline def efSpn_=(x: IVectorView[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("efSpn")(x.asInstanceOf[js.Any])
  
  /** Static property that gets the GID1 path. */
  /* static member */
  @JSGlobal("Windows.Networking.NetworkOperators.KnownRuimFilePaths.gid1")
  @js.native
  def gid1: IVectorView[Double] = js.native
  inline def gid1_=(x: IVectorView[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gid1")(x.asInstanceOf[js.Any])
  
  /** Static property that gets the GID2 path. */
  /* static member */
  @JSGlobal("Windows.Networking.NetworkOperators.KnownRuimFilePaths.gid2")
  @js.native
  def gid2: IVectorView[Double] = js.native
  inline def gid2_=(x: IVectorView[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gid2")(x.asInstanceOf[js.Any])
}
