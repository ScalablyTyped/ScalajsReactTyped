package typingsJapgolly.oracleOraclejet.ojdataproviderMod

import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.no
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.unknown
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.yes
import typingsJapgolly.std.AsyncIterable
import typingsJapgolly.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataProvider[K, D]
  extends StObject
     with EventTarget {
  
  def containsKeys(parameters: FetchByKeysParameters[K]): js.Promise[ContainsKeysResults[K]] = js.native
  
  def fetchByKeys(parameters: FetchByKeysParameters[K]): js.Promise[FetchByKeysResults[K, D]] = js.native
  
  def fetchByOffset(parameters: FetchByOffsetParameters[D]): js.Promise[FetchByOffsetResults[K, D]] = js.native
  
  def fetchFirst(): AsyncIterable[FetchListResult[K, D]] = js.native
  def fetchFirst(parameters: FetchListParameters[D]): AsyncIterable[FetchListResult[K, D]] = js.native
  
  def getCapability(capabilityName: String): Any = js.native
  
  def getTotalSize(): js.Promise[Double] = js.native
  
  def isEmpty(): yes | no | unknown = js.native
}
