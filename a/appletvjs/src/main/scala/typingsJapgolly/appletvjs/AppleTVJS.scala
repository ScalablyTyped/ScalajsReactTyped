package typingsJapgolly.appletvjs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Document
import typingsJapgolly.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AppleTVJS {
  
  @js.native
  trait App extends StObject {
    
    /**
      * The onError attribute is used to handle any errors sent from the device.
      * This attribute must be set to a function that accepts an “options” argument.
      * For example App.onError = function (options) {}.
      * */
    def onError(options: Any): Unit = js.native
    
    /**
      * The onExit attribute is used to complete any actions that need to be cleaned
      * up when the app has been exited. This attribute must be set to a function that
      * accepts an “options” argument. For example App.onExit = function (options) {}.
      * */
    def onExit(options: Any): Unit = js.native
    
    /**
      * The onLaunch attribute is used to start any required actions when the app
      * launches. This attribute must be set to a function that accepts an “options”
      * argument. For example App.onLaunch = function (options) {}.
      * */
    def onLaunch(options: Any): Unit = js.native
    
    /**
      * This function reloads the initial JavaScript file without quitting the app.
      * The optional reloadData parameter provides developers with a way to capture
      * and restart the app in it’s current state. If the reloadData parameter is not
      * present, the app is restarted in its initial state. This attribute must be set
      * to a function that accepts an “options” argument.
      * For example App.onError = function (options) {}.
      * */
    def reload(): Unit = js.native
    def reload(options: Any): Unit = js.native
    def reload(options: Any, reloadData: Any): Unit = js.native
    def reload(options: Unit, reloadData: Any): Unit = js.native
  }
  
  trait Device extends StObject {
    
    /** The unique identifier for the app. */
    var appIdentifier: String
    
    /** The current app version. */
    var appVersion: String
    
    /** A string that identifies the device model. */
    var model: String
    
    /** The version of the product installed on the device. */
    var productType: String
    
    /** The operating system on the device. */
    var systemVersion: String
    
    /** The UUID of the device. */
    var vendorIdentifier: String
  }
  object Device {
    
    inline def apply(
      appIdentifier: String,
      appVersion: String,
      model: String,
      productType: String,
      systemVersion: String,
      vendorIdentifier: String
    ): Device = {
      val __obj = js.Dynamic.literal(appIdentifier = appIdentifier.asInstanceOf[js.Any], appVersion = appVersion.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], productType = productType.asInstanceOf[js.Any], systemVersion = systemVersion.asInstanceOf[js.Any], vendorIdentifier = vendorIdentifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[Device]
    }
    
    extension [Self <: Device](x: Self) {
      
      inline def setAppIdentifier(value: String): Self = StObject.set(x, "appIdentifier", value.asInstanceOf[js.Any])
      
      inline def setAppVersion(value: String): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
      
      inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setProductType(value: String): Self = StObject.set(x, "productType", value.asInstanceOf[js.Any])
      
      inline def setSystemVersion(value: String): Self = StObject.set(x, "systemVersion", value.asInstanceOf[js.Any])
      
      inline def setVendorIdentifier(value: String): Self = StObject.set(x, "vendorIdentifier", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FeatureElement
    extends StObject
       with Element {
    
    /** Gets a feature for a given element. */
    def getFeature(feature: String): Any = js.native
  }
  
  trait Highlight extends StObject {
    
    /** The description of the highlight. */
    var description: String
    
    /** The duration of the highlight. */
    var duration: Double
    
    /** The imageURL of the highlight. */
    var imageURL: String
    
    /** The name of the highlight. */
    var name: String
    
    /** The starttime of the highlight. */
    var starttime: Double
  }
  object Highlight {
    
    inline def apply(description: String, duration: Double, imageURL: String, name: String, starttime: Double): Highlight = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], imageURL = imageURL.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], starttime = starttime.asInstanceOf[js.Any])
      __obj.asInstanceOf[Highlight]
    }
    
    extension [Self <: Highlight](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setImageURL(value: String): Self = StObject.set(x, "imageURL", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStarttime(value: Double): Self = StObject.set(x, "starttime", value.asInstanceOf[js.Any])
    }
  }
  
  trait HighlightGroup extends StObject {
    
    /** The hightlights in the highlight group. */
    var hightlights: js.Array[Highlight]
    
    /** The name of the highlight group. */
    var name: String
  }
  object HighlightGroup {
    
    inline def apply(hightlights: js.Array[Highlight], name: String): HighlightGroup = {
      val __obj = js.Dynamic.literal(hightlights = hightlights.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[HighlightGroup]
    }
    
    extension [Self <: HighlightGroup](x: Self) {
      
      inline def setHightlights(value: js.Array[Highlight]): Self = StObject.set(x, "hightlights", value.asInstanceOf[js.Any])
      
      inline def setHightlightsVarargs(value: Highlight*): Self = StObject.set(x, "hightlights", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Interstitial extends StObject {
    
    /** The duration of the interstitial. */
    var duration: Double
    
    /** The starttime of the interstitial. */
    var starttime: Double
  }
  object Interstitial {
    
    inline def apply(duration: Double, starttime: Double): Interstitial = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], starttime = starttime.asInstanceOf[js.Any])
      __obj.asInstanceOf[Interstitial]
    }
    
    extension [Self <: Interstitial](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setStarttime(value: Double): Self = StObject.set(x, "starttime", value.asInstanceOf[js.Any])
    }
  }
  
  trait Keyboard extends StObject {
    
    /**
      * A callback function that is called when the text inside
      * of searchField or textField element changes.
      * */
    def onTextChange(): Unit
    
    /** The text inside of a searchField or textField element. */
    var text: String
  }
  object Keyboard {
    
    inline def apply(onTextChange: Callback, text: String): Keyboard = {
      val __obj = js.Dynamic.literal(onTextChange = onTextChange.toJsFn, text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Keyboard]
    }
    
    extension [Self <: Keyboard](x: Self) {
      
      inline def setOnTextChange(value: Callback): Self = StObject.set(x, "onTextChange", value.toJsFn)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait MediaItem extends StObject {
    
    /** The URL path to the artwork that accompanies the media item. */
    var artworkImageURL: String
    
    /**
      * The domain that the rating applies to.
      * There are three valid values for this property: movie, music, and tvshow.
      * */
    var contentRatingDomain: String
    
    /**
      * The rating for a video item.
      * The rating is a value from 0-1000. This value corresponds to a specific rating
      * used by different countries. For example, a rating value can represent a PG-13
      * rating in the United State and a MA15+ in Australia.
      * */
    var contentRatingRanking: Double
    
    /** The description for a media item. */
    var description: String
    
    /** An array of highlightGroup objects. */
    var highlightGroups: js.Array[HighlightGroup]
    
    /** An array of interstitial objects. */
    var interstitials: js.Array[Interstitial]
    
    /**
      * A value indicating whether the item has explicit lyrics.
      * This property is ignored if the MediaItem object type is video.
      * */
    var isExplicit: Boolean
    
    /** A callback function used to load the asset identifier for an item. */
    def loadAssetID(url: String, callback: js.Function2[/* assetID */ String, /* error */ String, Unit]): Unit
    
    /** A callback function used to load the security certificate for an item. */
    def loadCertificate(url: String, callback: js.Function2[/* certificate */ String, /* error */ String, Unit]): Unit
    
    /** A callback function used to load the security key for an item. */
    def loadKey(
      url: String,
      requestData: Any,
      callback: js.Function3[/* key */ String, /* renewalDate */ String, /* error */ String, Unit]
    ): Unit
    
    /**
      * The number, in seconds, that a media item starts playing at.
      * Use this to begin playing a MediaItem object at a time other than
      * at the beginning of the object. If this property contains anything
      * other than 0, the player displays “Resume” instead of
      * “Play from beginning” on playback.
      * */
    var resumeTime: Double
    
    /** The subtitle for a the media item. */
    var subtitle: String
    
    /** The title of the media item. */
    var title: String
    
    /**
      * The type of media item.
      * The valid values for this attribute are audio and video.
      * */
    var `type`: String
    
    /** The URL path to the media item. */
    var url: String
  }
  object MediaItem {
    
    inline def apply(
      artworkImageURL: String,
      contentRatingDomain: String,
      contentRatingRanking: Double,
      description: String,
      highlightGroups: js.Array[HighlightGroup],
      interstitials: js.Array[Interstitial],
      isExplicit: Boolean,
      loadAssetID: (String, js.Function2[/* assetID */ String, /* error */ String, Unit]) => Callback,
      loadCertificate: (String, js.Function2[/* certificate */ String, /* error */ String, Unit]) => Callback,
      loadKey: (String, Any, js.Function3[/* key */ String, /* renewalDate */ String, /* error */ String, Unit]) => Callback,
      resumeTime: Double,
      subtitle: String,
      title: String,
      `type`: String,
      url: String
    ): MediaItem = {
      val __obj = js.Dynamic.literal(artworkImageURL = artworkImageURL.asInstanceOf[js.Any], contentRatingDomain = contentRatingDomain.asInstanceOf[js.Any], contentRatingRanking = contentRatingRanking.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], highlightGroups = highlightGroups.asInstanceOf[js.Any], interstitials = interstitials.asInstanceOf[js.Any], isExplicit = isExplicit.asInstanceOf[js.Any], loadAssetID = js.Any.fromFunction2((t0: String, t1: js.Function2[/* assetID */ String, /* error */ String, Unit]) => (loadAssetID(t0, t1)).runNow()), loadCertificate = js.Any.fromFunction2((t0: String, t1: js.Function2[/* certificate */ String, /* error */ String, Unit]) => (loadCertificate(t0, t1)).runNow()), loadKey = js.Any.fromFunction3((t0: String, t1: Any, t2: js.Function3[/* key */ String, /* renewalDate */ String, /* error */ String, Unit]) => (loadKey(t0, t1, t2)).runNow()), resumeTime = resumeTime.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaItem]
    }
    
    extension [Self <: MediaItem](x: Self) {
      
      inline def setArtworkImageURL(value: String): Self = StObject.set(x, "artworkImageURL", value.asInstanceOf[js.Any])
      
      inline def setContentRatingDomain(value: String): Self = StObject.set(x, "contentRatingDomain", value.asInstanceOf[js.Any])
      
      inline def setContentRatingRanking(value: Double): Self = StObject.set(x, "contentRatingRanking", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setHighlightGroups(value: js.Array[HighlightGroup]): Self = StObject.set(x, "highlightGroups", value.asInstanceOf[js.Any])
      
      inline def setHighlightGroupsVarargs(value: HighlightGroup*): Self = StObject.set(x, "highlightGroups", js.Array(value*))
      
      inline def setInterstitials(value: js.Array[Interstitial]): Self = StObject.set(x, "interstitials", value.asInstanceOf[js.Any])
      
      inline def setInterstitialsVarargs(value: Interstitial*): Self = StObject.set(x, "interstitials", js.Array(value*))
      
      inline def setIsExplicit(value: Boolean): Self = StObject.set(x, "isExplicit", value.asInstanceOf[js.Any])
      
      inline def setLoadAssetID(value: (String, js.Function2[/* assetID */ String, /* error */ String, Unit]) => Callback): Self = StObject.set(x, "loadAssetID", js.Any.fromFunction2((t0: String, t1: js.Function2[/* assetID */ String, /* error */ String, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setLoadCertificate(value: (String, js.Function2[/* certificate */ String, /* error */ String, Unit]) => Callback): Self = StObject.set(x, "loadCertificate", js.Any.fromFunction2((t0: String, t1: js.Function2[/* certificate */ String, /* error */ String, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setLoadKey(
        value: (String, Any, js.Function3[/* key */ String, /* renewalDate */ String, /* error */ String, Unit]) => Callback
      ): Self = StObject.set(x, "loadKey", js.Any.fromFunction3((t0: String, t1: Any, t2: js.Function3[/* key */ String, /* renewalDate */ String, /* error */ String, Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setResumeTime(value: Double): Self = StObject.set(x, "resumeTime", value.asInstanceOf[js.Any])
      
      inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait MenuBarDocument extends StObject {
    
    /**
      * Retrieves the document associated with the specified menu item.
      * */
    def getDocument(menuItem: org.scalajs.dom.Element): Document
    
    /**
      * Associates a document with a menu item.
      * */
    def setDocument(document: Document, menuItem: org.scalajs.dom.Element): Unit
    
    /**
      * Sets the focus in a menu bar to the specified menu item.
      * */
    def setSelectedItem(menuItem: org.scalajs.dom.Element): Unit
  }
  object MenuBarDocument {
    
    inline def apply(
      getDocument: org.scalajs.dom.Element => Document,
      setDocument: (Document, org.scalajs.dom.Element) => Callback,
      setSelectedItem: org.scalajs.dom.Element => Callback
    ): MenuBarDocument = {
      val __obj = js.Dynamic.literal(getDocument = js.Any.fromFunction1(getDocument), setDocument = js.Any.fromFunction2((t0: Document, t1: org.scalajs.dom.Element) => (setDocument(t0, t1)).runNow()), setSelectedItem = js.Any.fromFunction1((t0: org.scalajs.dom.Element) => setSelectedItem(t0).runNow()))
      __obj.asInstanceOf[MenuBarDocument]
    }
    
    extension [Self <: MenuBarDocument](x: Self) {
      
      inline def setGetDocument(value: org.scalajs.dom.Element => Document): Self = StObject.set(x, "getDocument", js.Any.fromFunction1(value))
      
      inline def setSetDocument(value: (Document, org.scalajs.dom.Element) => Callback): Self = StObject.set(x, "setDocument", js.Any.fromFunction2((t0: Document, t1: org.scalajs.dom.Element) => (value(t0, t1)).runNow()))
      
      inline def setSetSelectedItem(value: org.scalajs.dom.Element => Callback): Self = StObject.set(x, "setSelectedItem", js.Any.fromFunction1((t0: org.scalajs.dom.Element) => value(t0).runNow()))
    }
  }
  
  @js.native
  trait NavigationDocument extends StObject {
    
    /**
      * Removes all documents currently on the stack.
      * */
    def clear(): Unit = js.native
    
    /** Dismisses the document displayed in modal view. */
    def dismissModal(): Unit = js.native
    
    /** The documents currently on the stack. */
    var documents: js.Array[Document] = js.native
    
    /**
      * Inserts a new document directly before a document currently on the stack.
      * */
    def insertBeforeDocument(document: Document): Unit = js.native
    def insertBeforeDocument(document: Document, beforeDocument: Document): Unit = js.native
    
    /**
      * Removes the top most document from the stack.
      * */
    def popDocument(): Unit = js.native
    
    /**
      * Removes all of the documents on the stack that are above the passed document.
      * */
    def popToDocument(document: Document): Unit = js.native
    
    /**
      * Removes all documents from the stack except for the bottom most document.
      * */
    def popToRootDocument(): Unit = js.native
    
    /**
      * Displays the passed document on top of the current document.
      * */
    def presentModal(document: Document): Unit = js.native
    
    /**
      * This function searches the stack for the first instance of the document
      * contained in the beforeDocument parameter and inserts the document contained
      * in the document parameter on top of it.
      * */
    def pushDocument(document: Document): Unit = js.native
    
    /**
      * Removes the specified document from the stack.
      * */
    def removeDocument(document: Document): Unit = js.native
    
    /**
      * Replaces a document on the stack with a new document.
      * */
    def replaceDocument(document: Document): Unit = js.native
    def replaceDocument(document: Document, beforeDocument: Document): Unit = js.native
  }
  
  @js.native
  trait Player extends StObject {
    
    /** The currently selected media item in the playlist. */
    var currentMediaItem: MediaItem = js.native
    
    /**
      * An event notifying the listener that the player is about to change media items.
      *
      * Valid values are:
      * errorDidOccur
      * fastForwardedToEndOfMediaItem
      * mannuallyChanged
      * newPlaylist
      * playerInvalidated
      * playedToEndOfMediaItem
      * */
    def mediaItemDidChange(reason: String): Unit = js.native
    
    /** The next media item in the playlist. */
    var nextMediaItem: MediaItem = js.native
    
    /** The annotations for a video created by placing a DOM document over the video. */
    var overlayDocument: Document = js.native
    
    /** Pauses the currently playing media item. */
    def pause(): Unit = js.native
    
    /** Plays the currently selected media item. */
    def play(): Unit = js.native
    
    /**
      * The current state of the player.
      *
      * This property can contain the following valid values:
      * begin
      * end
      * loading
      * playing
      * paused
      * scanning
      * */
    var playbackState: String = js.native
    
    /** The play list for a player. */
    var playlist: Playlist = js.native
    
    /** Shows the player UI if it is not currently visible. */
    def present(): Unit = js.native
    
    /** The previous MediaItem object in the playlist. */
    var previousMediaItem: MediaItem = js.native
    
    /**
      * An event that indicates if a seek to time request was accomplished.
      *
      * The values for this attribute can be one of the following:
      * true — The seek performed as requested.
      * false or null— The seek was not performed.
      * An integer value — The seek will be performed to the stated value and not the initial requested value.
      * */
    def requestSeekToTime(): Unit = js.native
    def requestSeekToTime(result: Any): Unit = js.native
    
    /** Sets the playback point to a specified time. */
    def seekToTime(time: Double): Unit = js.native
    
    /** Sets the playback speed. */
    def setPlaybackRate(playbackRate: Double): Unit = js.native
    
    /** An event that indicates a state change request has occurred. */
    def shouldHandleStateChange(result: Boolean): Unit = js.native
    
    /** An event that indicates the state has changed. */
    def stateDidChange(): Unit = js.native
    
    /** An event that indicates the state is about to change. */
    def stateWillChange(): Unit = js.native
    
    /** Stops the currently playing item and dismisses the player UI. */
    def stop(): Unit = js.native
    
    /** An event that indicates a particular playback time has been crossed. */
    def timeBoundaryDidCross(): Unit = js.native
    
    /** An event that happens at a specified interval. */
    def timeDidChange(): Unit = js.native
    
    /** An event that happens whenever a specified piece of metadata occurs. */
    def timedMetadata(): Unit = js.native
  }
  
  trait Playlist extends StObject {
    
    /** Returns the MediaItem located in the indicated array index. */
    def item(index: Double): MediaItem
    
    /** The number of items in the playlist. */
    var length: Double
    
    /** Removes a media item from the end of a playlist. */
    def pop(): MediaItem
    
    /** Adds a media item to the end of a playlist. */
    def push(`object`: MediaItem): Unit
    
    /** Deletes the indicated array elements and replaces them with the specified elements. */
    def splice(index: Double, howManu: Double, `object`: MediaItem): js.Array[MediaItem]
  }
  object Playlist {
    
    inline def apply(
      item: Double => MediaItem,
      length: Double,
      pop: CallbackTo[MediaItem],
      push: MediaItem => Callback,
      splice: (Double, Double, MediaItem) => js.Array[MediaItem]
    ): Playlist = {
      val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any], pop = pop.toJsFn, push = js.Any.fromFunction1((t0: MediaItem) => push(t0).runNow()), splice = js.Any.fromFunction3(splice))
      __obj.asInstanceOf[Playlist]
    }
    
    extension [Self <: Playlist](x: Self) {
      
      inline def setItem(value: Double => MediaItem): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setPop(value: CallbackTo[MediaItem]): Self = StObject.set(x, "pop", value.toJsFn)
      
      inline def setPush(value: MediaItem => Callback): Self = StObject.set(x, "push", js.Any.fromFunction1((t0: MediaItem) => value(t0).runNow()))
      
      inline def setSplice(value: (Double, Double, MediaItem) => js.Array[MediaItem]): Self = StObject.set(x, "splice", js.Any.fromFunction3(value))
    }
  }
  
  trait Restrictions extends StObject {
    
    /** A boolean value that indicates if explicit media is allowed. */
    var allowsExplicit: Boolean
    
    /** The maximum movie ranking allowed. */
    var maxMovieRank: Double
    
    /** The maximum movie rating allowed for the specified country. */
    def maxMovieRatingForCountry(countryCode: String): String
    
    /** The maximum television show ranking allowed. */
    var maxTVShowRank: Double
    
    /** Sets the maximum television show rating allowed for the specified country. */
    def maxTVShowRatingForCountry(countryCode: String): String
  }
  object Restrictions {
    
    inline def apply(
      allowsExplicit: Boolean,
      maxMovieRank: Double,
      maxMovieRatingForCountry: String => String,
      maxTVShowRank: Double,
      maxTVShowRatingForCountry: String => String
    ): Restrictions = {
      val __obj = js.Dynamic.literal(allowsExplicit = allowsExplicit.asInstanceOf[js.Any], maxMovieRank = maxMovieRank.asInstanceOf[js.Any], maxMovieRatingForCountry = js.Any.fromFunction1(maxMovieRatingForCountry), maxTVShowRank = maxTVShowRank.asInstanceOf[js.Any], maxTVShowRatingForCountry = js.Any.fromFunction1(maxTVShowRatingForCountry))
      __obj.asInstanceOf[Restrictions]
    }
    
    extension [Self <: Restrictions](x: Self) {
      
      inline def setAllowsExplicit(value: Boolean): Self = StObject.set(x, "allowsExplicit", value.asInstanceOf[js.Any])
      
      inline def setMaxMovieRank(value: Double): Self = StObject.set(x, "maxMovieRank", value.asInstanceOf[js.Any])
      
      inline def setMaxMovieRatingForCountry(value: String => String): Self = StObject.set(x, "maxMovieRatingForCountry", js.Any.fromFunction1(value))
      
      inline def setMaxTVShowRank(value: Double): Self = StObject.set(x, "maxTVShowRank", value.asInstanceOf[js.Any])
      
      inline def setMaxTVShowRatingForCountry(value: String => String): Self = StObject.set(x, "maxTVShowRatingForCountry", js.Any.fromFunction1(value))
    }
  }
  
  trait Settings extends StObject {
    
    /** Contains the language the device displays information in. */
    var language: String
    
    /**
      * Called when changes to a device’s restriction information changes.
      */
    def onRestrictionsChange(): Unit
    
    /** Contains the restriction information on the device. */
    var restrictions: Restrictions
    
    /** Contains the country code used by the store on this device. */
    var storefrontCountryCode: String
  }
  object Settings {
    
    inline def apply(
      language: String,
      onRestrictionsChange: Callback,
      restrictions: Restrictions,
      storefrontCountryCode: String
    ): Settings = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], onRestrictionsChange = onRestrictionsChange.toJsFn, restrictions = restrictions.asInstanceOf[js.Any], storefrontCountryCode = storefrontCountryCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Settings]
    }
    
    extension [Self <: Settings](x: Self) {
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setOnRestrictionsChange(value: Callback): Self = StObject.set(x, "onRestrictionsChange", value.toJsFn)
      
      inline def setRestrictions(value: Restrictions): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
      
      inline def setStorefrontCountryCode(value: String): Self = StObject.set(x, "storefrontCountryCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait TVError extends StObject {
    
    /** The error code. */
    var code: String
    
    /** A string containing the description of the error. */
    var description: String
    
    /**
      * A string containing the error domain.
      *
      * The predefined error domains:
      * NSPOSIXErrorDomain - POSIX/BSD errors
      * NSOSStatusErrorDomain - OS X/Carbon errors
      * NSMachErrorDomain - Mach errors
      * */
    var domain: String
    
    /**
      * The user info dictionary.
      *
      * These keys may exist in the user info dictionary:
      * NSLocalizedDesciptionKey
      * NSFilePathErrorKey
      * NSStringEncodingErrorKey
      * NSUnderlyingErrorKey
      * NSURLErrorKey
      * NSLocalizedFailureReasonErrorKey
      * NSLocalizedRecoverySuggestionErrorKey
      * NSLocalizedRecoveryOptionsErrorKey
      * NSRecoveryAttempterErrorKey
      * NSHelpAnchorErrorKey
      * NSURLErrorFailingURLErrorKey
      * NSURLErrorFailingURLStringErrorKey
      * NSURLErrorFailingURLPeerTrustErrorKey
      * */
    var userInfo: Any
  }
  object TVError {
    
    inline def apply(code: String, description: String, domain: String, userInfo: Any): TVError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[TVError]
    }
    
    extension [Self <: TVError](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setUserInfo(value: Any): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
    }
  }
}
