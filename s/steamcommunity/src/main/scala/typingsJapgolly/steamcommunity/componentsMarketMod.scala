package typingsJapgolly.steamcommunity

import typingsJapgolly.steamcommunity.anon.Foil
import typingsJapgolly.steamcommunity.anon.GemValue
import typingsJapgolly.steamcommunity.anon.GemsReceived
import typingsJapgolly.steamcommunity.anon.GiftName
import typingsJapgolly.steamcommunity.mod.Callback
import typingsJapgolly.steamcommunity.mod.CallbackError
import typingsJapgolly.steamcommunity.mod.appid
import typingsJapgolly.steamcommunity.mod.assetid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsMarketMod {
  
  trait Market extends StObject {
    
    /**
      * Check if an item is eligible to be turned into gems and if so, get its gem value.
      * Note that the AppID you need to provide is the AppID of the game to which the item belongs, not 753 (which is the AppID to which Steam Community items actually belong).
      *
      * @param appid
      * @param assetid
      * @param callback
      */
    def getGemValue(
      appid: appid,
      assetid: assetid,
      callback: js.Function2[/* err */ CallbackError, /* res */ GemValue, Any]
    ): Unit
    
    /**
      * Get details about a gift in your Steam Gifts inventory.
      *
      * @param giftID A string containing the assetid of the gift in your inventory.
      * @param callback A function to be called when the requested data is available
      */
    def getGiftDetails(giftID: String, callback: js.Function2[/* err */ CallbackError, /* res */ GiftName, Any]): Unit
    
    /**
      * Requests a list of all apps which support the Steam Community Market (this list is scraped from the app buttons on the right side of the market home page).
      *
      * @param callback Called when the requested data is available.
      */
    def getMarketApps(callback: js.Function2[/* err */ CallbackError, /* apps */ js.Object, Any]): Unit
    
    /**
      * Unpacks a booster pack in your inventory.
      *
      * @param appid The AppID of the game to which the booster pack in question belongs.
      * @param assetid The AssetID of the booster pack in question.
      * @param callback A function to be called when the request completes.
      */
    def openBoosterPack(
      appid: appid,
      assetid: assetid,
      callback: js.Function2[/* err */ CallbackError, /* items */ js.Array[Foil], Any]
    ): Unit
    
    /**
      * Packs some gems into sacks. If you have multiple gem stacks in your inventory, this can only be used to pack one stack at a time.
      * If you have multiple sack stacks in your inventory, there is no way to specify which stack the newly-acquired stacks should be added to.
      *
      * @param assetid - ID of gem stack you want to pack into sacks
      * @param desiredSackCount - How many sacks you want. You must have at least this amount * 1000 gems in the stack you're packing
      * @param callback A function to be called when the request completes.
      */
    def packGemSacks(assetid: assetid, desiredSackCount: Double, callback: Callback): Unit
    
    /**
      * Redeem a gift in your Steam Gifts inventory and add it to your library.
      *
      * @param giftID A string containing the assetid of the gift in your inventory.
      * @param callback A function to be called when the request completes.
      */
    def redeemGift(giftID: String, callback: Callback): Unit
    
    /**
      * Turn an eligible item into gems.
      * @param appid
      * @param assetid
      * @param expectedGemsValue
      * @param callback
      */
    def turnItemIntoGems(
      appid: appid,
      assetid: assetid,
      expectedGemsValue: Double,
      callback: js.Function2[/* err */ CallbackError, /* res */ GemsReceived, Any]
    ): Unit
    
    /**
      * Unpacks some sacks of gems. You will receive 1000 gems for eaach sack you unpack.
      * If you have multiple gem stacks in your inventory, there is no way to specify which stack newly-acquired gems should be added to.
      * @param assetid - ID of sack stack you want to unpack (say that 5 times fast).
      * @param sacksToUnpack How many sacks in the stack you want to unpack.
      * @param callback A function to be called when the request completes.
      */
    def unpackGemSacks(assetid: assetid, sacksToUnpack: Double, callback: Callback): Unit
  }
  object Market {
    
    inline def apply(
      getGemValue: (appid, assetid, js.Function2[/* err */ CallbackError, /* res */ GemValue, Any]) => japgolly.scalajs.react.Callback,
      getGiftDetails: (String, js.Function2[/* err */ CallbackError, /* res */ GiftName, Any]) => japgolly.scalajs.react.Callback,
      getMarketApps: js.Function2[/* err */ CallbackError, /* apps */ js.Object, Any] => japgolly.scalajs.react.Callback,
      openBoosterPack: (appid, assetid, js.Function2[/* err */ CallbackError, /* items */ js.Array[Foil], Any]) => japgolly.scalajs.react.Callback,
      packGemSacks: (assetid, Double, Callback) => japgolly.scalajs.react.Callback,
      redeemGift: (String, Callback) => japgolly.scalajs.react.Callback,
      turnItemIntoGems: (appid, assetid, Double, js.Function2[/* err */ CallbackError, /* res */ GemsReceived, Any]) => japgolly.scalajs.react.Callback,
      unpackGemSacks: (assetid, Double, Callback) => japgolly.scalajs.react.Callback
    ): Market = {
      val __obj = js.Dynamic.literal(getGemValue = js.Any.fromFunction3((t0: appid, t1: assetid, t2: js.Function2[/* err */ CallbackError, /* res */ GemValue, Any]) => (getGemValue(t0, t1, t2)).runNow()), getGiftDetails = js.Any.fromFunction2((t0: String, t1: js.Function2[/* err */ CallbackError, /* res */ GiftName, Any]) => (getGiftDetails(t0, t1)).runNow()), getMarketApps = js.Any.fromFunction1((t0: js.Function2[/* err */ CallbackError, /* apps */ js.Object, Any]) => getMarketApps(t0).runNow()), openBoosterPack = js.Any.fromFunction3((t0: appid, t1: assetid, t2: js.Function2[/* err */ CallbackError, /* items */ js.Array[Foil], Any]) => (openBoosterPack(t0, t1, t2)).runNow()), packGemSacks = js.Any.fromFunction3((t0: assetid, t1: Double, t2: Callback) => (packGemSacks(t0, t1, t2)).runNow()), redeemGift = js.Any.fromFunction2((t0: String, t1: Callback) => (redeemGift(t0, t1)).runNow()), turnItemIntoGems = js.Any.fromFunction4((t0: appid, t1: assetid, t2: Double, t3: js.Function2[/* err */ CallbackError, /* res */ GemsReceived, Any]) => (turnItemIntoGems(t0, t1, t2, t3)).runNow()), unpackGemSacks = js.Any.fromFunction3((t0: assetid, t1: Double, t2: Callback) => (unpackGemSacks(t0, t1, t2)).runNow()))
      __obj.asInstanceOf[Market]
    }
    
    extension [Self <: Market](x: Self) {
      
      inline def setGetGemValue(
        value: (appid, assetid, js.Function2[/* err */ CallbackError, /* res */ GemValue, Any]) => japgolly.scalajs.react.Callback
      ): Self = StObject.set(x, "getGemValue", js.Any.fromFunction3((t0: appid, t1: assetid, t2: js.Function2[/* err */ CallbackError, /* res */ GemValue, Any]) => (value(t0, t1, t2)).runNow()))
      
      inline def setGetGiftDetails(
        value: (String, js.Function2[/* err */ CallbackError, /* res */ GiftName, Any]) => japgolly.scalajs.react.Callback
      ): Self = StObject.set(x, "getGiftDetails", js.Any.fromFunction2((t0: String, t1: js.Function2[/* err */ CallbackError, /* res */ GiftName, Any]) => (value(t0, t1)).runNow()))
      
      inline def setGetMarketApps(
        value: js.Function2[/* err */ CallbackError, /* apps */ js.Object, Any] => japgolly.scalajs.react.Callback
      ): Self = StObject.set(x, "getMarketApps", js.Any.fromFunction1((t0: js.Function2[/* err */ CallbackError, /* apps */ js.Object, Any]) => value(t0).runNow()))
      
      inline def setOpenBoosterPack(
        value: (appid, assetid, js.Function2[/* err */ CallbackError, /* items */ js.Array[Foil], Any]) => japgolly.scalajs.react.Callback
      ): Self = StObject.set(x, "openBoosterPack", js.Any.fromFunction3((t0: appid, t1: assetid, t2: js.Function2[/* err */ CallbackError, /* items */ js.Array[Foil], Any]) => (value(t0, t1, t2)).runNow()))
      
      inline def setPackGemSacks(value: (assetid, Double, Callback) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "packGemSacks", js.Any.fromFunction3((t0: assetid, t1: Double, t2: Callback) => (value(t0, t1, t2)).runNow()))
      
      inline def setRedeemGift(value: (String, Callback) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "redeemGift", js.Any.fromFunction2((t0: String, t1: Callback) => (value(t0, t1)).runNow()))
      
      inline def setTurnItemIntoGems(
        value: (appid, assetid, Double, js.Function2[/* err */ CallbackError, /* res */ GemsReceived, Any]) => japgolly.scalajs.react.Callback
      ): Self = StObject.set(x, "turnItemIntoGems", js.Any.fromFunction4((t0: appid, t1: assetid, t2: Double, t3: js.Function2[/* err */ CallbackError, /* res */ GemsReceived, Any]) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setUnpackGemSacks(value: (assetid, Double, Callback) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "unpackGemSacks", js.Any.fromFunction3((t0: assetid, t1: Double, t2: Callback) => (value(t0, t1, t2)).runNow()))
    }
  }
}
