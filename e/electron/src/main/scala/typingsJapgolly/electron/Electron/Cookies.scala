package typingsJapgolly.electron.Electron

import typingsJapgolly.electron.electronStrings.`expired-overwrite`
import typingsJapgolly.electron.electronStrings.changed
import typingsJapgolly.electron.electronStrings.evicted
import typingsJapgolly.electron.electronStrings.expired
import typingsJapgolly.electron.electronStrings.explicit
import typingsJapgolly.electron.electronStrings.overwrite
import typingsJapgolly.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cookies extends EventEmitter {
  
  def addListener(
    event: changed,
    listener: js.Function4[
      /* event */ Event, 
      /* cookie */ Cookie, 
      /* cause */ explicit | overwrite | expired | evicted | `expired-overwrite`, 
      /* removed */ Boolean, 
      Unit
    ]
  ): this.type = js.native
  
  /**
    * A promise which resolves when the cookie store has been flushed
    *
    * Writes any unwritten cookies data to disk.
    */
  def flushStore(): js.Promise[Unit] = js.native
  
  /**
    * A promise which resolves an array of cookie objects.
    *
    * Sends a request to get all cookies matching `filter`, and resolves a promise
    * with the response.
    */
  def get(filter: CookiesGetFilter): js.Promise[js.Array[Cookie]] = js.native
  
  // Docs: https://electronjs.org/docs/api/cookies
  /**
    * Emitted when a cookie is changed because it was added, edited, removed, or
    * expired.
    */
  def on(
    event: changed,
    listener: js.Function4[
      /* event */ Event, 
      /* cookie */ Cookie, 
      /* cause */ explicit | overwrite | expired | evicted | `expired-overwrite`, 
      /* removed */ Boolean, 
      Unit
    ]
  ): this.type = js.native
  
  def once(
    event: changed,
    listener: js.Function4[
      /* event */ Event, 
      /* cookie */ Cookie, 
      /* cause */ explicit | overwrite | expired | evicted | `expired-overwrite`, 
      /* removed */ Boolean, 
      Unit
    ]
  ): this.type = js.native
  
  /**
    * A promise which resolves when the cookie has been removed
    *
    * Removes the cookies matching `url` and `name`
    */
  def remove(url: String, name: String): js.Promise[Unit] = js.native
  
  def removeListener(
    event: changed,
    listener: js.Function4[
      /* event */ Event, 
      /* cookie */ Cookie, 
      /* cause */ explicit | overwrite | expired | evicted | `expired-overwrite`, 
      /* removed */ Boolean, 
      Unit
    ]
  ): this.type = js.native
  
  /**
    * A promise which resolves when the cookie has been set
    *
    * Sets a cookie with `details`.
    */
  def set(details: CookiesSetDetails): js.Promise[Unit] = js.native
}
