package typingsJapgolly.meteor.anon

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.meteor.meteorStrings.available
import typingsJapgolly.meteor.meteorStrings.linearizable
import typingsJapgolly.meteor.meteorStrings.majority
import typingsJapgolly.meteor.meteorStrings.snapshot
import typingsJapgolly.mongodb.anon.Level
import typingsJapgolly.mongodb.mod.ReadConcern
import typingsJapgolly.mongodb.mod.ReadConcernLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofReadConcern
  extends StObject
     with Instantiable1[/* level */ ReadConcernLevel, ReadConcern] {
  
  def AVAILABLE: available = js.native
  
  def LINEARIZABLE: linearizable = js.native
  
  def MAJORITY: majority = js.native
  
  def SNAPSHOT: snapshot = js.native
  
  /**
    * Construct a ReadConcern given an options object.
    *
    * @param options - The options object from which to extract the write concern.
    */
  def fromOptions(): js.UndefOr[ReadConcern] = js.native
  def fromOptions(options: Level): js.UndefOr[ReadConcern] = js.native
}
