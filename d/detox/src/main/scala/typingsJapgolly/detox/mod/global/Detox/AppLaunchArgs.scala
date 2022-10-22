package typingsJapgolly.detox.mod.global.Detox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A construct allowing for the querying and modification of user arguments passed to an app upon launch by Detox.
  *
  * @see AppLaunchArgs#modify
  * @see AppLaunchArgs#reset
  * @see AppLaunchArgs#get
  */
@js.native
trait AppLaunchArgs extends StObject {
  
  /**
    * Get all currently set launch arguments (including shared ones).
    * @returns An object containing all launch-arguments.
    * Note: mutating the values inside the result object is pointless, as it is immutable.
    */
  def get(): js.Object = js.native
  /**
    * @deprecated Use {@link AppLaunchArgs#shared} instead.
    */
  def get(options: AppLaunchArgsOperationOptions): js.Object = js.native
  
  /**
    * Modify the launch-arguments via a modifier object, according to the following logic:
    * - Non-nullish modifier properties would set a new value or override the previous value of
    *   existing properties with the same name.
    * - Modifier properties set to either `undefined` or `null` would delete the corresponding property
    *   if it existed.
    * These custom app launch arguments get erased whenever you select a different application.
    * If you need to share them between all the applications, use {@link AppLaunchArgs#shared} property.
    * Note: app-specific launch args have a priority over shared ones.
    *
    * @param modifier The modifier object.
    * @example
    * // With current launch arguments set to:
    * // {
    * //   mockServerPort: 1234,
    * //   mockServerCredentials: 'user@test.com:12345678',
    * // }
    * device.appLaunchArgs.modify({
    *   mockServerPort: 4321,
    *   mockServerCredentials: null,
    *   mockServerToken: 'abcdef',
    * });
    * await device.launchApp();
    * // ==> launch-arguments become:
    * // {
    * //   mockServerPort: 4321,
    * //   mockServerToken: 'abcdef',
    * // }
    */
  def modify(modifier: js.Object): this.type = js.native
  /**
    * @deprecated Use {@link AppLaunchArgs#shared} instead.
    */
  def modify(modifier: js.Object, options: AppLaunchArgsOperationOptions): this.type = js.native
  
  /**
    * Reset all app-specific launch arguments (back to an empty object).
    * If you need to reset the shared launch args, use {@link AppLaunchArgs#shared}.
    */
  def reset(): this.type = js.native
  /**
    * @deprecated Use {@link AppLaunchArgs#shared} instead.
    */
  def reset(options: AppLaunchArgsOperationOptions): this.type = js.native
  
  /**
    * Shared (global) arguments that are not specific to a particular application.
    * Selecting another app does not reset them, yet they still can be overridden
    * by configuring app-specific launch args.
    * @see Device#selectApp
    * @see AppLaunchArgs
    */
  val shared: ScopedAppLaunchArgs = js.native
}
