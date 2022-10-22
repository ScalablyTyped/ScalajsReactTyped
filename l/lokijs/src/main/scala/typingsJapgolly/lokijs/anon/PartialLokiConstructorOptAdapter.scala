package typingsJapgolly.lokijs.anon

import typingsJapgolly.lokijs.LokiPersistenceAdapter
import typingsJapgolly.lokijs.lokijsStrings.BROWSER
import typingsJapgolly.lokijs.lokijsStrings.CORDOVA
import typingsJapgolly.lokijs.lokijsStrings.NA
import typingsJapgolly.lokijs.lokijsStrings.NATIVESCRIPT
import typingsJapgolly.lokijs.lokijsStrings.NODEJS
import typingsJapgolly.lokijs.lokijsStrings.destructured
import typingsJapgolly.lokijs.lokijsStrings.fs
import typingsJapgolly.lokijs.lokijsStrings.localStorage
import typingsJapgolly.lokijs.lokijsStrings.memory
import typingsJapgolly.lokijs.lokijsStrings.normal
import typingsJapgolly.lokijs.lokijsStrings.pretty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<lokijs.LokiConstructorOptions> & lokijs.LokiConfigOptions & std.Partial<lokijs.ThrottledSaveDrainOptions> */
@js.native
trait PartialLokiConstructorOptAdapter extends StObject {
  
  var adapter: LokiPersistenceAdapter | Null = js.native
  
  var autoload: Boolean = js.native
  
  def autoloadCallback(err: Any): Unit = js.native
  
  var autosave: Boolean = js.native
  
  def autosaveCallback(): Unit = js.native
  def autosaveCallback(err: Any): Unit = js.native
  
  var autosaveInterval: String | Double = js.native
  
  var destructureDelimiter: String = js.native
  
  var env: js.UndefOr[NATIVESCRIPT | NODEJS | CORDOVA | BROWSER | NA] = js.native
  
  var persistenceMethod: fs | localStorage | memory | Null = js.native
  
  var recursiveWait: js.UndefOr[Boolean] = js.native
  
  var recursiveWaitLimit: js.UndefOr[Boolean] = js.native
  
  var recursiveWaitLimitDuration: js.UndefOr[Double] = js.native
  
  var serializationMethod: normal | pretty | destructured | Null = js.native
  
  var started: js.UndefOr[Double] = js.native
  
  var throttledSaves: Boolean = js.native
  
  var verbose: js.UndefOr[Boolean] = js.native
}
