package typingsJapgolly.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cfgutils {
  
  @JSGlobal("KSR.cfgutils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def abort(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("abort")().asInstanceOf[Double]
  
  inline def coreHash(s1: String, s2: String, sz: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("core_hash")(s1.asInstanceOf[js.Any], s2.asInstanceOf[js.Any], sz.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def lock(lkey: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("lock")(lkey.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def pkgStatus(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("pkg_status")().asInstanceOf[Double]
  
  inline def pkgSummary(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("pkg_summary")().asInstanceOf[Double]
  
  inline def randEvent(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rand_event")().asInstanceOf[Double]
  
  inline def randGetProb(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rand_get_prob")().asInstanceOf[Double]
  
  inline def randResetProb(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rand_reset_prob")().asInstanceOf[Double]
  
  inline def randSetProb(percent_par: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rand_set_prob")(percent_par.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def shmStatus(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("shm_status")().asInstanceOf[Double]
  
  inline def shmSummary(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("shm_summary")().asInstanceOf[Double]
  
  inline def trylock(lkey: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("trylock")(lkey.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def unlock(lkey: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unlock")(lkey.asInstanceOf[js.Any]).asInstanceOf[Double]
}
