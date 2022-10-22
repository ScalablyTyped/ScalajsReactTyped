package typingsJapgolly.detox.mod.global.Detox

import typingsJapgolly.detox.anon.PartialDetoxConfig
import typingsJapgolly.detox.detoxStrings.UNSAFE_configReady
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetoxExportWrapper
  extends StObject
     with DetoxInstance {
  
  def afterEach(args: Any*): js.Promise[Unit] = js.native
  
  def beforeEach(args: Any*): js.Promise[Unit] = js.native
  
  /**
    * The cleanup phase should happen after all the tests have finished.
    * This is the phase where the Detox server shuts down.
    *
    * @example
    * after(async () => {
    *  await detox.cleanup();
    * });
    */
  def cleanup(): js.Promise[Unit] = js.native
  
  /**
    * Unstable. API to access an assembled detox config before it gets passed to testRunner
    * or detox.init(). Use it only if you don't have another option.
    * @internal
    */
  @JSName("hook")
  def hook_UNSAFEconfigReady(event: UNSAFE_configReady, listener: js.Function1[/* config */ Any, Unit]): Unit = js.native
  
  /**
    * The setup phase happens inside detox.init(). This is the phase where detox reads its configuration, starts a server, loads its expection library and starts a simulator
    *
    * @param configOverride - this object is deep-merged with the selected Detox configuration from .detoxrc
    * @example
    * beforeAll(async () => {
    *   await detox.init();
    * });
    */
  def init(): js.Promise[Unit] = js.native
  def init(configOverride: Unit, options: DetoxInitOptions): js.Promise[Unit] = js.native
  def init(configOverride: PartialDetoxConfig): js.Promise[Unit] = js.native
  def init(configOverride: PartialDetoxConfig, options: DetoxInitOptions): js.Promise[Unit] = js.native
}
