package typingsJapgolly.coinlist

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.coinlist.coinlistStrings.id
import typingsJapgolly.coinlist.coinlistStrings.name
import typingsJapgolly.coinlist.coinlistStrings.symbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("coinlist", JSImport.Namespace)
  @js.native
  val ^ : js.Array[Coin] & CoinsAPI = js.native
  
  type Coin = typingsJapgolly.coinlist.srcCoinsDotjsonMod.Coin
  
  @js.native
  trait CoinsAPI extends StObject {
    
    def get(symbol: String): js.UndefOr[Coin] = js.native
    def get(symbol: String, property: id | symbol | name): js.UndefOr[String] = js.native
  }
  
  type _To = js.Array[Coin] & CoinsAPI
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Array[Coin] & CoinsAPI = ^
}
