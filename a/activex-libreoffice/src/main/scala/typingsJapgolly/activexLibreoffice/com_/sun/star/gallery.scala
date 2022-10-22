package typingsJapgolly.activexLibreoffice.com_.sun.star

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.graphic.XGraphic
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XInitialization
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gallery {
  
  /** service to get access to the properties of a single Gallery item */
  trait GalleryItem
    extends StObject
       with XGalleryItem
       with XPropertySet {
    
    /**
      * the drawing content of the Gallery item
      *
      * This is an optional property and may not available for every item
      */
    var Drawing: XComponent
    
    /**
      * The type of the Gallery item
      * @see GalleryItemType
      */
    var GalleryItemType: Double
    
    /**
      * the graphic content of the Gallery item
      *
      * This is an optional property and may not available for every item
      */
    var Graphic: XGraphic
    
    /**
      * the thumbnail of the Gallery item
      *
      * The thumbnail may be either a pixel or a vector graphic
      */
    var Thumbnail: XGraphic
    
    /** the title of the Gallery item */
    var Title: String
    
    /**
      * the URL of the Gallery item
      *
      * The interpretation of the URL depends on the type of the Gallery item. In case of graphic and media items, the URL is a "real" URL, in case of
      * drawings it is a private URL
      */
    var URL: String
  }
  object GalleryItem {
    
    inline def apply(
      Drawing: XComponent,
      GalleryItemType: Double,
      Graphic: XGraphic,
      PropertySetInfo: XPropertySetInfo,
      Thumbnail: XGraphic,
      Title: String,
      Type: Double,
      URL: String,
      acquire: Callback,
      addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
      addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
      getPropertySetInfo: CallbackTo[XPropertySetInfo],
      getPropertyValue: String => Any,
      getType: CallbackTo[Double],
      queryInterface: `type` => Any,
      release: Callback,
      removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
      removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
      setPropertyValue: (String, Any) => Callback
    ): GalleryItem = {
      val __obj = js.Dynamic.literal(Drawing = Drawing.asInstanceOf[js.Any], GalleryItemType = GalleryItemType.asInstanceOf[js.Any], Graphic = Graphic.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Thumbnail = Thumbnail.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), getType = getType.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
      __obj.asInstanceOf[GalleryItem]
    }
    
    extension [Self <: GalleryItem](x: Self) {
      
      inline def setDrawing(value: XComponent): Self = StObject.set(x, "Drawing", value.asInstanceOf[js.Any])
      
      inline def setGalleryItemType(value: Double): Self = StObject.set(x, "GalleryItemType", value.asInstanceOf[js.Any])
      
      inline def setGraphic(value: XGraphic): Self = StObject.set(x, "Graphic", value.asInstanceOf[js.Any])
      
      inline def setThumbnail(value: XGraphic): Self = StObject.set(x, "Thumbnail", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
      
      inline def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
    }
  }
  
  object GalleryItemType {
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
      - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
      - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
      - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
    */
    trait Constants extends StObject
    object Constants {
      
      inline def DRAWING: `3` = 3.asInstanceOf[`3`]
      
      inline def EMPTY: `0` = 0.asInstanceOf[`0`]
      
      inline def GRAPHIC: `1` = 1.asInstanceOf[`1`]
      
      inline def MEDIA: `2` = 2.asInstanceOf[`2`]
    }
  }
  
  /**
    * provides access to a container of Gallery items and makes it possible for you to manipulate them.
    * @see XGalleryTheme
    */
  type GalleryTheme = XGalleryTheme
  
  /**
    * provides access to a container of GalleryThemes and makes it possible for you to manipulate them.
    * @see XGalleryThemeProvider
    */
  trait GalleryThemeProvider
    extends StObject
       with XGalleryThemeProvider
       with XInitialization
  object GalleryThemeProvider {
    
    inline def apply(
      ElementNames: SafeArray[String],
      ElementType: `type`,
      acquire: Callback,
      getByName: String => Any,
      getElementNames: CallbackTo[SafeArray[String]],
      getElementType: CallbackTo[`type`],
      hasByName: String => Boolean,
      hasElements: CallbackTo[Boolean],
      initialize: SeqEquiv[Any] => Callback,
      insertNewByName: String => XGalleryTheme,
      queryInterface: `type` => Any,
      release: Callback,
      removeByName: String => Callback
    ): GalleryThemeProvider = {
      val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, getByName = js.Any.fromFunction1(getByName), getElementNames = getElementNames.toJsFn, getElementType = getElementType.toJsFn, hasByName = js.Any.fromFunction1(hasByName), hasElements = hasElements.toJsFn, initialize = js.Any.fromFunction1((t0: SeqEquiv[Any]) => initialize(t0).runNow()), insertNewByName = js.Any.fromFunction1(insertNewByName), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeByName = js.Any.fromFunction1((t0: String) => removeByName(t0).runNow()))
      __obj.asInstanceOf[GalleryThemeProvider]
    }
  }
  
  /** provides access to a single item of a Gallery theme. */
  trait XGalleryItem
    extends StObject
       with XInterface {
    
    /**
      * retrieves the type of the Gallery item
      * @returns The type of the Gallery item
      * @see GalleryItemType
      */
    val Type: Double
    
    /**
      * retrieves the type of the Gallery item
      * @returns The type of the Gallery item
      * @see GalleryItemType
      */
    def getType(): Double
  }
  object XGalleryItem {
    
    inline def apply(
      Type: Double,
      acquire: Callback,
      getType: CallbackTo[Double],
      queryInterface: `type` => Any,
      release: Callback
    ): XGalleryItem = {
      val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], acquire = acquire.toJsFn, getType = getType.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[XGalleryItem]
    }
    
    extension [Self <: XGalleryItem](x: Self) {
      
      inline def setGetType(value: CallbackTo[Double]): Self = StObject.set(x, "getType", value.toJsFn)
      
      inline def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * provides access to the items of a Gallery themes. It also allows inserting and removing of single items.
    *
    * This interface extends the interface {@link com.sun.star.container.XIndexAccess} which provides access to existing Gallery items collection.
    * @see com.sun.star.container.XIndexAccess
    * @see com.sun.star.sheet.DataPilotTable
    */
  trait XGalleryTheme
    extends StObject
       with XIndexAccess {
    
    /**
      * retrieves the name of the Gallery theme
      * @returns The name of the Gallery theme
      */
    val Name: String
    
    /**
      * retrieves the name of the Gallery theme
      * @returns The name of the Gallery theme
      */
    def getName(): String
    
    /**
      * inserts an item
      * @param Drawing A drawing model that should be added to the collection
      * @param Index The zero based index of the position where to insert the new object inside the collection. If the index is larger than or equal to the numb
      * @returns The zero based position at which the object was inserted. If the object could not be inserted, -1 is returned.
      * @see XGalleryItem
      * @see com.sun.star.lang.WrappedTargetException
      */
    def insertDrawingByIndex(Drawing: XComponent, Index: Double): Double
    
    /**
      * inserts an item
      * @param Graphic The {@link com.sun.star.graphic.XGraphic} object that should be added to the collection
      * @param Index The zero based index of the position where to insert the new object inside the collection. If the index is larger than or equal to the numb
      * @returns The zero based position at which the object was inserted. If the object could not be inserted, -1 is returned.
      * @see com.sun.star.graphic.XGraphic
      * @see XGalleryItem
      * @see com.sun.star.lang.WrappedTargetException
      */
    def insertGraphicByIndex(Graphic: XGraphic, Index: Double): Double
    
    /**
      * inserts an item
      * @param URL The URL of a graphic or media object, that should be added to the collection
      * @param Index The zero based index of the position where to insert the new object inside the collection. If the index is larger than or equal to the numb
      * @returns The zero based position at which the object was inserted. If the object could not be inserted, -1 is returned.
      * @see XGalleryItem
      * @see com.sun.star.lang.WrappedTargetException
      */
    def insertURLByIndex(URL: String, Index: Double): Double
    
    /**
      * deletes an item from the collection
      * @param Index The position of the item to be removed. The position is zero based.
      * @see com.sun.star.container.NoSuchElementException
      */
    def removeByIndex(Index: Double): Unit
    
    /**
      * updates the theme
      *
      * This method iterates over each item of the Gallery theme and updates it accordingly. Main purpose is to automatically regenerate the thumbnails and to
      * remove invalid items, that is items who have got an URL that has become invalid. This method also optimizes underlying data structures.
      */
    def update(): Unit
  }
  object XGalleryTheme {
    
    inline def apply(
      Count: Double,
      ElementType: `type`,
      Name: String,
      acquire: Callback,
      getByIndex: Double => Any,
      getCount: CallbackTo[Double],
      getElementType: CallbackTo[`type`],
      getName: CallbackTo[String],
      hasElements: CallbackTo[Boolean],
      insertDrawingByIndex: (XComponent, Double) => Double,
      insertGraphicByIndex: (XGraphic, Double) => Double,
      insertURLByIndex: (String, Double) => Double,
      queryInterface: `type` => Any,
      release: Callback,
      removeByIndex: Double => Callback,
      update: Callback
    ): XGalleryTheme = {
      val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], acquire = acquire.toJsFn, getByIndex = js.Any.fromFunction1(getByIndex), getCount = getCount.toJsFn, getElementType = getElementType.toJsFn, getName = getName.toJsFn, hasElements = hasElements.toJsFn, insertDrawingByIndex = js.Any.fromFunction2(insertDrawingByIndex), insertGraphicByIndex = js.Any.fromFunction2(insertGraphicByIndex), insertURLByIndex = js.Any.fromFunction2(insertURLByIndex), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeByIndex = js.Any.fromFunction1((t0: Double) => removeByIndex(t0).runNow()), update = update.toJsFn)
      __obj.asInstanceOf[XGalleryTheme]
    }
    
    extension [Self <: XGalleryTheme](x: Self) {
      
      inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
      
      inline def setInsertDrawingByIndex(value: (XComponent, Double) => Double): Self = StObject.set(x, "insertDrawingByIndex", js.Any.fromFunction2(value))
      
      inline def setInsertGraphicByIndex(value: (XGraphic, Double) => Double): Self = StObject.set(x, "insertGraphicByIndex", js.Any.fromFunction2(value))
      
      inline def setInsertURLByIndex(value: (String, Double) => Double): Self = StObject.set(x, "insertURLByIndex", js.Any.fromFunction2(value))
      
      inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setRemoveByIndex(value: Double => Callback): Self = StObject.set(x, "removeByIndex", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setUpdate(value: Callback): Self = StObject.set(x, "update", value.toJsFn)
    }
  }
  
  /**
    * provides access to the Gallery themes. It also allows inserting and removing of Gallery themes by name.
    *
    * This interface extends the interface {@link com.sun.star.container.XNameAccess} which provides access to existing Gallery themes collection.
    * @see com.sun.star.container.XNameAccess
    */
  trait XGalleryThemeProvider
    extends StObject
       with XNameAccess {
    
    /**
      * creates a new Gallery theme and adds it to the collection.
      * @param ThemeName The name of the Gallery theme to be added to the collection. The name must be unique.
      * @returns The created theme interface
      * @see com.sun.star.container.ElementExistException
      */
    def insertNewByName(ThemeName: String): XGalleryTheme
    
    /**
      * deletes a Gallery theme from the collection.
      * @param ThemeName The name of the Gallery theme to be removed. The theme with the given name must exist.
      * @see com.sun.star.container.NoSuchElementException
      */
    def removeByName(ThemeName: String): Unit
  }
  object XGalleryThemeProvider {
    
    inline def apply(
      ElementNames: SafeArray[String],
      ElementType: `type`,
      acquire: Callback,
      getByName: String => Any,
      getElementNames: CallbackTo[SafeArray[String]],
      getElementType: CallbackTo[`type`],
      hasByName: String => Boolean,
      hasElements: CallbackTo[Boolean],
      insertNewByName: String => XGalleryTheme,
      queryInterface: `type` => Any,
      release: Callback,
      removeByName: String => Callback
    ): XGalleryThemeProvider = {
      val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, getByName = js.Any.fromFunction1(getByName), getElementNames = getElementNames.toJsFn, getElementType = getElementType.toJsFn, hasByName = js.Any.fromFunction1(hasByName), hasElements = hasElements.toJsFn, insertNewByName = js.Any.fromFunction1(insertNewByName), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeByName = js.Any.fromFunction1((t0: String) => removeByName(t0).runNow()))
      __obj.asInstanceOf[XGalleryThemeProvider]
    }
    
    extension [Self <: XGalleryThemeProvider](x: Self) {
      
      inline def setInsertNewByName(value: String => XGalleryTheme): Self = StObject.set(x, "insertNewByName", js.Any.fromFunction1(value))
      
      inline def setRemoveByName(value: String => Callback): Self = StObject.set(x, "removeByName", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
}
