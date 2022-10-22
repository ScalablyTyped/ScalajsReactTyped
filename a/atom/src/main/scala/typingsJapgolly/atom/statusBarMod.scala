package typingsJapgolly.atom

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statusBarMod {
  
  trait AddTileOptions extends StObject {
    
    /**
      *  A DOM element, a jQuery object, or a model object for which a view provider
      *  has been registered in the the view registry.
      */
    var item: js.Object
    
    /**
      *  Determines the placement of the tile within the status bar. Lower priority
      *  will result in closer placement to the anchor.
      */
    var priority: Double
  }
  object AddTileOptions {
    
    inline def apply(item: js.Object, priority: Double): AddTileOptions = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddTileOptions]
    }
    
    extension [Self <: AddTileOptions](x: Self) {
      
      inline def setItem(value: js.Object): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    }
  }
  
  trait StatusBar extends StObject {
    
    /**
      *  Add a tile to the left side of the status bar. Lower priority tiles are placed
      *  further to the left.
      */
    def addLeftTile(options: AddTileOptions): Tile
    
    /**
      *  Add a tile to the right side of the status bar. Lower priority tiles are placed
      *  further to the right.
      */
    def addRightTile(options: AddTileOptions): Tile
    
    /** Retrieve all of the tiles on the left side of the status bar. */
    def getLeftTiles(): js.Array[Tile]
    
    /** Retrieve all of the tiles on the right side of the status bar. */
    def getRightTiles(): js.Array[Tile]
  }
  object StatusBar {
    
    inline def apply(
      addLeftTile: AddTileOptions => Tile,
      addRightTile: AddTileOptions => Tile,
      getLeftTiles: CallbackTo[js.Array[Tile]],
      getRightTiles: CallbackTo[js.Array[Tile]]
    ): StatusBar = {
      val __obj = js.Dynamic.literal(addLeftTile = js.Any.fromFunction1(addLeftTile), addRightTile = js.Any.fromFunction1(addRightTile), getLeftTiles = getLeftTiles.toJsFn, getRightTiles = getRightTiles.toJsFn)
      __obj.asInstanceOf[StatusBar]
    }
    
    extension [Self <: StatusBar](x: Self) {
      
      inline def setAddLeftTile(value: AddTileOptions => Tile): Self = StObject.set(x, "addLeftTile", js.Any.fromFunction1(value))
      
      inline def setAddRightTile(value: AddTileOptions => Tile): Self = StObject.set(x, "addRightTile", js.Any.fromFunction1(value))
      
      inline def setGetLeftTiles(value: CallbackTo[js.Array[Tile]]): Self = StObject.set(x, "getLeftTiles", value.toJsFn)
      
      inline def setGetRightTiles(value: CallbackTo[js.Array[Tile]]): Self = StObject.set(x, "getRightTiles", value.toJsFn)
    }
  }
  
  trait Tile extends StObject {
    
    /** Remove the Tile from the status bar. */
    def destroy(): Unit
    
    /** Retrieve the Tile's item. */
    def getItem(): js.Object
    
    /** Retrieve the priority that was assigned to the Tile when it was created. */
    def getPriority(): Double
  }
  object Tile {
    
    inline def apply(destroy: Callback, getItem: CallbackTo[js.Object], getPriority: CallbackTo[Double]): Tile = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, getItem = getItem.toJsFn, getPriority = getPriority.toJsFn)
      __obj.asInstanceOf[Tile]
    }
    
    extension [Self <: Tile](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setGetItem(value: CallbackTo[js.Object]): Self = StObject.set(x, "getItem", value.toJsFn)
      
      inline def setGetPriority(value: CallbackTo[Double]): Self = StObject.set(x, "getPriority", value.toJsFn)
    }
  }
}
