package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel

import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology
import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletDetailViewPosition
import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletItemKind
import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletSummaryViewPosition
import typingsJapgolly.winrtUwp.Windows.Devices.Geolocation.BasicGeoposition
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IMap
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import typingsJapgolly.winrtUwp.Windows.UI.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides types for interacting with the Wallet feature of Windows Phone from a Windows Runtime app. */
object Wallet {
  
  /** Defines a set of asynchronous actions and operations that manage the wallet items in the system wallet database. These can be used to read the existing items, or to add and remove items. */
  object System {
    
    /** Defines values used by the GetAppStatusForItem method indicating if an app is installed for the specified WalletItem . */
    @JSGlobal("Windows.ApplicationModel.Wallet.System.WalletItemAppAssociation")
    @js.native
    object WalletItemAppAssociation extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.System.WalletItemAppAssociation & Double
          ] = js.native
      
      /* 1 */ val appInstalled: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.System.WalletItemAppAssociation.appInstalled & Double = js.native
      
      /* 2 */ val appNotInstalled: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.System.WalletItemAppAssociation.appNotInstalled & Double = js.native
      
      /* 0 */ val none: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.System.WalletItemAppAssociation.none & Double = js.native
    }
    
    /** Defines a set of asynchronous actions and operations that manage the wallet items in the system wallet database. These can be used to read the existing items, or to add and remove items. */
    /* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Wallet.System.WalletItemSystemStore")
    @js.native
    open class WalletItemSystemStore ()
      extends StObject
         with typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.System.WalletItemSystemStore
    
    /** Provides a static method to get an instance of the system wallet store for this app. */
    /* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Wallet.System.WalletManagerSystem")
    @js.native
    open class WalletManagerSystem ()
      extends StObject
         with typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.System.WalletManagerSystem
    object WalletManagerSystem {
      
      @JSGlobal("Windows.ApplicationModel.Wallet.System.WalletManagerSystem")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Requests an instance of the system wallet store for the app.
        * @return An asynchronous operation that, on successful completion, returns an instance of the default wallet store. If you use Asynchronous programming, the result type is a single WalletItemSystemStore object.
        */
      /* static member */
      inline def requestStoreAsync(): IPromiseWithIAsyncOperation[
            typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.System.WalletItemSystemStore
          ] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestStoreAsync")().asInstanceOf[IPromiseWithIAsyncOperation[
            typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.System.WalletItemSystemStore
          ]]
    }
  }
  
  /** Represents the action that was taken on the item that caused your app to launch. */
  @JSGlobal("Windows.ApplicationModel.Wallet.WalletActionKind")
  @js.native
  object WalletActionKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletActionKind & Double
      ] = js.native
    
    /* 3 */ val message: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletActionKind.message & Double = js.native
    
    /* 2 */ val moreTransactions: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletActionKind.moreTransactions & Double = js.native
    
    /* 0 */ val openItem: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletActionKind.openItem & Double = js.native
    
    /* 1 */ val transaction: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletActionKind.transaction & Double = js.native
    
    /* 4 */ val verb: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletActionKind.verb & Double = js.native
  }
  
  /** Represents a bar code assigned to a wallet item. */
  @JSGlobal("Windows.ApplicationModel.Wallet.WalletBarcode")
  @js.native
  open class WalletBarcode protected ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletBarcode {
    /**
      * Initializes a new instance of the WalletBarcode class.
      * @param streamToBarcodeImage A stream representing the bar code image.
      */
    def this(streamToBarcodeImage: IRandomAccessStreamReference) = this()
    /**
      * Initializes a new instance of the WalletBarcode class.
      * @param symbology The symbology type for this barcode. Use one of the supported symbologies, such as Upca. Don't set to Invalid or Custom.
      * @param value The message ( Value ) that the barcode represents.
      */
    def this(symbology: WalletBarcodeSymbology, value: String) = this()
    
    /**
      * Creates and returns a bitmap image stream for the barcode (or returns the custom image used during instantiation).
      * @return An asynchronous operation. If you use Asynchronous programming, the result type on successful completion is an IRandomAccessStreamReference instance. This can be assigned as the source for an image (with some additional code).
      */
    /* CompleteClass */
    override def getImageAsync(): IPromiseWithIAsyncOperation[IRandomAccessStreamReference] = js.native
    
    /** Gets the symbology used by the bar code. */
    /* CompleteClass */
    var symbology: WalletBarcodeSymbology = js.native
    
    /** Gets a string representation of the barcode (its message). */
    /* CompleteClass */
    var value: String = js.native
  }
  
  /** Represents the barcode symbology types that are supported for a WalletItem . */
  @JSGlobal("Windows.ApplicationModel.Wallet.WalletBarcodeSymbology")
  @js.native
  object WalletBarcodeSymbology extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology & Double
      ] = js.native
    
    /* 10 */ val aztec: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology.aztec & Double = js.native
    
    /* 7 */ val code128: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology.code128 & Double = js.native
    
    /* 6 */ val code39: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology.code39 & Double = js.native
    
    /* 11 */ val custom: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology.custom & Double = js.native
    
    /* 3 */ val ean13: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology.ean13 & Double = js.native
    
    /* 4 */ val ean8: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology.ean8 & Double = js.native
    
    /* 0 */ val invalid: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology.invalid & Double = js.native
    
    /* 5 */ val itf: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology.itf & Double = js.native
    
    /* 9 */ val pdf417: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology.pdf417 & Double = js.native
    
    /* 8 */ val qr: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology.qr & Double = js.native
    
    /* 1 */ val upca: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology.upca & Double = js.native
    
    /* 2 */ val upce: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletBarcodeSymbology.upce & Double = js.native
  }
  
  /** Describes the position in the detail view of a wallet item that a WalletItemCustomProperty record should be displayed at. */
  @JSGlobal("Windows.ApplicationModel.Wallet.WalletDetailViewPosition")
  @js.native
  object WalletDetailViewPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletDetailViewPosition & Double
      ] = js.native
    
    /* 10 */ val centerField1: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletDetailViewPosition.centerField1 & Double = js.native
    
    /* 11 */ val footerField1: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletDetailViewPosition.footerField1 & Double = js.native
    
    /* 12 */ val footerField2: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletDetailViewPosition.footerField2 & Double = js.native
    
    /* 13 */ val footerField3: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletDetailViewPosition.footerField3 & Double = js.native
    
    /* 14 */ val footerField4: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletDetailViewPosition.footerField4 & Double = js.native
    
    /* 1 */ val headerField1: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletDetailViewPosition.headerField1 & Double = js.native
    
    /* 2 */ val headerField2: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletDetailViewPosition.headerField2 & Double = js.native
    
    /* 0 */ val hidden: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletDetailViewPosition.hidden & Double = js.native
    
    /* 3 */ val primaryField1: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletDetailViewPosition.primaryField1 & Double = js.native
    
    /* 4 */ val primaryField2: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletDetailViewPosition.primaryField2 & Double = js.native
    
    /* 5 */ val secondaryField1: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletDetailViewPosition.secondaryField1 & Double = js.native
    
    /* 6 */ val secondaryField2: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletDetailViewPosition.secondaryField2 & Double = js.native
    
    /* 7 */ val secondaryField3: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletDetailViewPosition.secondaryField3 & Double = js.native
    
    /* 8 */ val secondaryField4: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletDetailViewPosition.secondaryField4 & Double = js.native
    
    /* 9 */ val secondaryField5: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletDetailViewPosition.secondaryField5 & Double = js.native
  }
  
  /** Represents an item (data) that is stored in the wallet. */
  @JSGlobal("Windows.ApplicationModel.Wallet.WalletItem")
  @js.native
  open class WalletItem protected ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletItem {
    /**
      * Initializes a new instance of the WalletItem class.
      * @param kind The type of wallet item.
      * @param displayName The display name of the item.
      */
    def this(kind: WalletItemKind, displayName: String) = this()
    
    /** Gets or sets the barcode that's representative of the wallet item. */
    /* CompleteClass */
    var barcode: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletBarcode = js.native
    
    /** Gets or sets the background image of the body of the wallet item (uses a stream). */
    /* CompleteClass */
    var bodyBackgroundImage: IRandomAccessStreamReference = js.native
    
    /** Gets or sets the body color of the wallet item. */
    /* CompleteClass */
    var bodyColor: Color = js.native
    
    /** Gets or sets the body font color of the wallet item. */
    /* CompleteClass */
    var bodyFontColor: Color = js.native
    
    /** Gets or sets a string that appears next to the app name in About info. */
    /* CompleteClass */
    var displayMessage: String = js.native
    
    /** Gets or sets the name or title to be displayed to the user. */
    /* CompleteClass */
    var displayName: String = js.native
    
    /** Gets the collection of WalletItemCustomProperty objects associated with the wallet item. */
    /* CompleteClass */
    var displayProperties: IMap[
        String, 
        typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletItemCustomProperty
      ] = js.native
    
    /** Gets or sets the expiration date of the wallet item. */
    /* CompleteClass */
    var expirationDate: js.Date = js.native
    
    /** Gets or sets the header background image of the wallet item. */
    /* CompleteClass */
    var headerBackgroundImage: IRandomAccessStreamReference = js.native
    
    /** Gets or sets the header color of the wallet item. */
    /* CompleteClass */
    var headerColor: Color = js.native
    
    /** Gets or sets the header font color of the wallet item. */
    /* CompleteClass */
    var headerFontColor: Color = js.native
    
    /** Gets the unique identifier of the wallet item. */
    /* CompleteClass */
    var id: String = js.native
    
    /** Gets or sets whether this item is acknowledged by the app. */
    /* CompleteClass */
    var isAcknowledged: Boolean = js.native
    
    /** Gets or sets whether to launch your app when the user taps on the DisplayMessage . */
    /* CompleteClass */
    var isDisplayMessageLaunchable: Boolean = js.native
    
    /** Gets or sets whether your app should be launched when the user taps "see more transaction history". */
    /* CompleteClass */
    var isMoreTransactionHistoryLaunchable: Boolean = js.native
    
    /** Gets or sets the issuer name of the wallet item. */
    /* CompleteClass */
    var issuerDisplayName: String = js.native
    
    /** Gets the type of the wallet item. */
    /* CompleteClass */
    var kind: WalletItemKind = js.native
    
    /** Gets or sets the date and time the data for this item was last updated. */
    /* CompleteClass */
    var lastUpdated: js.Date = js.native
    
    /** Gets or sets the medium (159 x 159) logo image of the wallet item. */
    /* CompleteClass */
    var logo159x159: IRandomAccessStreamReference = js.native
    
    /** Gets or sets the large (336 x 336) logo image of the wallet item. */
    /* CompleteClass */
    var logo336x336: IRandomAccessStreamReference = js.native
    
    /** Gets or sets the small (99 x 99) logo image of the wallet item. */
    /* CompleteClass */
    var logo99x99: IRandomAccessStreamReference = js.native
    
    /** Gets or sets the logo image of the wallet item. */
    /* CompleteClass */
    var logoImage: IRandomAccessStreamReference = js.native
    
    /** Gets or sets the logo text of the wallet item. */
    /* CompleteClass */
    var logoText: String = js.native
    
    /** Gets or sets the promotional image of the wallet item. */
    /* CompleteClass */
    var promotionalImage: IRandomAccessStreamReference = js.native
    
    /** Gets or sets the date on which the item is valid. */
    /* CompleteClass */
    var relevantDate: js.Date = js.native
    
    /** Gets or sets the description of the relevant date of the wallet item. */
    /* CompleteClass */
    var relevantDateDisplayMessage: String = js.native
    
    /** Gets a collection of all relevant locations for the wallet item. */
    /* CompleteClass */
    var relevantLocations: IMap[
        String, 
        typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletRelevantLocation
      ] = js.native
    
    /** Gets the transaction history collection of the wallet item. */
    /* CompleteClass */
    var transactionHistory: IMap[String, typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletTransaction] = js.native
    
    /** Gets the collection of WalletVerb objects associated with the wallet item. */
    /* CompleteClass */
    var verbs: IMap[String, typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletVerb] = js.native
  }
  
  /** Defines a custom property on a wallet item. Apps can show data in the details view or back of card view of the item. */
  @JSGlobal("Windows.ApplicationModel.Wallet.WalletItemCustomProperty")
  @js.native
  open class WalletItemCustomProperty protected ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletItemCustomProperty {
    /**
      * Initializes a new instance of the WalletItemCustomProperty class.
      * @param name The custom property label. Sets the initial Name value.
      * @param value The value of the property. Sets the initial Value value.
      */
    def this(name: String, value: String) = this()
    
    /** Gets or sets whether this WalletItemCustomProperty is entity-extracted and actionable upon display. */
    /* CompleteClass */
    var autoDetectLinks: Boolean = js.native
    
    /** Gets or sets the optional position of this property when shown in the wallet item's detail view. */
    /* CompleteClass */
    var detailViewPosition: WalletDetailViewPosition = js.native
    
    /** Gets or sets the custom property label. */
    /* CompleteClass */
    var name: String = js.native
    
    /** Gets or sets the optional position of this property when shown in the summary view for a wallet item. */
    /* CompleteClass */
    var summaryViewPosition: WalletSummaryViewPosition = js.native
    
    /** Gets or sets the custom property value. */
    /* CompleteClass */
    var value: String = js.native
  }
  
  /** Represents the kinds (classifications) of wallet items supported. */
  @JSGlobal("Windows.ApplicationModel.Wallet.WalletItemKind")
  @js.native
  object WalletItemKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletItemKind & Double] = js.native
    
    /* 5 */ val boardingPass: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletItemKind.boardingPass & Double = js.native
    
    /* 1 */ val deal: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletItemKind.deal & Double = js.native
    
    /* 2 */ val general: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletItemKind.general & Double = js.native
    
    /* 0 */ val invalid: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletItemKind.invalid & Double = js.native
    
    /* 6 */ val membershipCard: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletItemKind.membershipCard & Double = js.native
    
    /* 3 */ val paymentInstrument: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletItemKind.paymentInstrument & Double = js.native
    
    /* 4 */ val ticket: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletItemKind.ticket & Double = js.native
  }
  
  /** Defines a set of asynchronous actions and operations that manage the wallet items in the wallet database. These can be used to read the existing items, or to add and remove items. */
  /* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Wallet.WalletItemStore")
  @js.native
  open class WalletItemStore ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletItemStore
  
  /** Provides a static method to get an instance of the default wallet store for this app. */
  /* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Wallet.WalletManager")
  @js.native
  open class WalletManager ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletManager
  object WalletManager {
    
    @JSGlobal("Windows.ApplicationModel.Wallet.WalletManager")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Requests an instance of the default wallet store for the app.
      * @return An asynchronous operation that, on successful completion, returns an instance of the default wallet store. If you use Asynchronous programming, the result type is a single WalletItemStore object.
      */
    /* static member */
    inline def requestStoreAsync(): IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletItemStore] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestStoreAsync")().asInstanceOf[IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletItemStore]]
  }
  
  /** Represents relevant location data for a wallet item. */
  @JSGlobal("Windows.ApplicationModel.Wallet.WalletRelevantLocation")
  @js.native
  /** Initializes a new instance of the WalletRelevantLocation class. */
  open class WalletRelevantLocation ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletRelevantLocation {
    
    /** Gets or sets the message associated with a relevant location. */
    /* CompleteClass */
    var displayMessage: String = js.native
    
    /** Gets or sets the basic geographic position information of the location. */
    /* CompleteClass */
    var position: BasicGeoposition = js.native
  }
  
  /** Describes the position in the summary view of a wallet item that a WalletItemCustomProperty should be displayed. */
  @JSGlobal("Windows.ApplicationModel.Wallet.WalletSummaryViewPosition")
  @js.native
  object WalletSummaryViewPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletSummaryViewPosition & Double
      ] = js.native
    
    /* 1 */ val field1: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletSummaryViewPosition.field1 & Double = js.native
    
    /* 2 */ val field2: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletSummaryViewPosition.field2 & Double = js.native
    
    /* 0 */ val hidden: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletSummaryViewPosition.hidden & Double = js.native
  }
  
  /** Represents a single wallet transaction in the transaction history. */
  @JSGlobal("Windows.ApplicationModel.Wallet.WalletTransaction")
  @js.native
  /** Initializes a new instance of the WalletTransaction class. */
  open class WalletTransaction ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletTransaction {
    
    /** Gets or sets the summary description (suitable for user UI) of the transaction. */
    /* CompleteClass */
    var description: String = js.native
    
    /** Gets or sets the transaction amount. */
    /* CompleteClass */
    var displayAmount: String = js.native
    
    /** Gets or sets a description (suitable for user UI) of the transaction location. */
    /* CompleteClass */
    var displayLocation: String = js.native
    
    /** Gets or sets whether to display the time of the transaction. */
    /* CompleteClass */
    var ignoreTimeOfDay: Boolean = js.native
    
    /** Gets or sets whether to launch your app when the user taps "see more transaction history". */
    /* CompleteClass */
    var isLaunchable: Boolean = js.native
    
    /** Gets or sets the date and time of the transaction. */
    /* CompleteClass */
    var transactionDate: js.Date = js.native
  }
  
  /** Represents a wallet verb, which is potentially used for app activation. This is a string suitable for UI that is descriptive of the action. */
  @JSGlobal("Windows.ApplicationModel.Wallet.WalletVerb")
  @js.native
  open class WalletVerb protected ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.ApplicationModel.Wallet.WalletVerb {
    /**
      * Initializes a new instance of the WalletVerb class.
      * @param name The name of the custom verb. Sets the value of the Name property.
      */
    def this(name: String) = this()
    
    /** Gets or sets the custom verb name. */
    /* CompleteClass */
    var name: String = js.native
  }
}
