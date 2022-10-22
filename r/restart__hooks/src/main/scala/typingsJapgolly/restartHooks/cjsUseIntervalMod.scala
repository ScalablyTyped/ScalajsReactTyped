package typingsJapgolly.restartHooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsUseIntervalMod {
  
  @JSImport("@restart/hooks/cjs/useInterval", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(fn: js.Function0[Unit], ms: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], ms.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Creates a pausable `setInterval` that is properly cleaned up when a component unmounted
    *
    * ```tsx
    *  const [paused, setPaused] = useState(false)
    *  const [timer, setTimer] = useState(0)
    *
    *  useInterval(() => setTimer(i => i + 1), 1000, paused)
    *
    *  return (
    *    <span>
    *      {timer} seconds past
    *
    *      <button onClick={() => setPaused(p => !p)}>{paused ? 'Play' : 'Pause' }</button>
    *    </span>
    * )
    * ```
    *
    * @param fn an function run on each interval
    * @param ms The milliseconds duration of the interval
    * @param paused Whether or not the interval is currently running
    */
  inline def default(fn: js.Function0[Unit], ms: Double, paused: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], ms.asInstanceOf[js.Any], paused.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Creates a pausable `setInterval` that _fires_ immediately and is
    * properly cleaned up when a component unmounted
    *
    * ```tsx
    *  const [timer, setTimer] = useState(-1)
    *  useInterval(() => setTimer(i => i + 1), 1000, false, true)
    *
    *  // will update to 0 on the first effect
    *  return <span>{timer} seconds past</span>
    * ```
    *
    * @param fn an function run on each interval
    * @param ms The milliseconds duration of the interval
    * @param paused Whether or not the interval is currently running
    * @param runImmediately Whether to run the function immediately on mount or unpause
    * rather than waiting for the first interval to elapse
    *
    */
  inline def default(fn: js.Function0[Unit], ms: Double, paused: Boolean, runImmediately: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], ms.asInstanceOf[js.Any], paused.asInstanceOf[js.Any], runImmediately.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
