package typingsJapgolly.winrtUwp.global.Windows.UI.Text

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.Deferral
import typingsJapgolly.winrtUwp.Windows.Foundation.Rect
import typingsJapgolly.winrtUwp.Windows.Globalization.Language
import typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextFormatUpdatingReason
import typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextFormatUpdatingResult
import typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextRange
import typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextSelectionUpdatingResult
import typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextTextUpdatingResult
import typingsJapgolly.winrtUwp.Windows.UI.ViewManagement.UIElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides types for accessing the Windows core text APIs and the text input server. Windows core text is a client-server system that centralizes the processing of keyboard input into a single server. You can use it to manipulate the edit buffer of your custom text input control; the text input server ensures that the contents of your text input control and the contents of its own edit buffer are always in sync via an asynchronous communication channel between the application and the server. */
object Core {
  
  /** Provides data for the CompositionCompleted event. */
  /* note: abstract class */ @JSGlobal("Windows.UI.Text.Core.CoreTextCompositionCompletedEventArgs")
  @js.native
  open class CoreTextCompositionCompletedEventArgs ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextCompositionCompletedEventArgs {
    
    /** Gets a collection of CoreTextCompositionSegment objects representing the segments in the composition string. Applications can use this property, for example, to get the pre-conversion string for each composition segment. */
    /* CompleteClass */
    var compositionSegments: IVectorView[typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextCompositionSegment] = js.native
    
    /**
      * Requests that the operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
      * @return A Deferral object.
      */
    /* CompleteClass */
    override def getDeferral(): Deferral = js.native
    
    /** Gets a value that indicates whether the operation is canceled. */
    /* CompleteClass */
    var isCanceled: Boolean = js.native
  }
  
  /** Represents a segment in a composition string. See Remarks for an illustration. */
  /* note: abstract class */ @JSGlobal("Windows.UI.Text.Core.CoreTextCompositionSegment")
  @js.native
  open class CoreTextCompositionSegment ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextCompositionSegment {
    
    /** Gets a string that represents the state of the user input after IME-processing but before final conversion. */
    /* CompleteClass */
    var preconversionString: String = js.native
    
    /** Gets an object that represents the range that defines this composition segment. */
    /* CompleteClass */
    var range: CoreTextRange = js.native
  }
  
  /** Provides data for the CompositionStarted event. */
  /* note: abstract class */ @JSGlobal("Windows.UI.Text.Core.CoreTextCompositionStartedEventArgs")
  @js.native
  open class CoreTextCompositionStartedEventArgs ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextCompositionStartedEventArgs {
    
    /**
      * Requests that the operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
      * @return A Deferral object.
      */
    /* CompleteClass */
    override def getDeferral(): Deferral = js.native
    
    /** Gets a value that indicates whether the operation is canceled. */
    /* CompleteClass */
    var isCanceled: Boolean = js.native
  }
  
  /** The primary object used by text input controls to communicate with the text input server. */
  /* note: abstract class */ @JSGlobal("Windows.UI.Text.Core.CoreTextEditContext")
  @js.native
  open class CoreTextEditContext ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextEditContext
  
  /** Provides data for the FormatUpdating event. */
  /* note: abstract class */ @JSGlobal("Windows.UI.Text.Core.CoreTextFormatUpdatingEventArgs")
  @js.native
  open class CoreTextFormatUpdatingEventArgs ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextFormatUpdatingEventArgs {
    
    /** Gets a value that represents the background color to be applied to the text range. The text input server populates this property before raising the event. */
    /* CompleteClass */
    var backgroundColor: UIElementType = js.native
    
    /**
      * Requests that the format update operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
      * @return A Deferral object.
      */
    /* CompleteClass */
    override def getDeferral(): Deferral = js.native
    
    /** Gets a value that indicates whether the format update operation is canceled. */
    /* CompleteClass */
    var isCanceled: Boolean = js.native
    
    /** Gets a value that indicates the range of text that the text input server needs to format. The server populates this property before raising the event. */
    /* CompleteClass */
    var range: CoreTextRange = js.native
    
    /** Gets a value that indicates the reason that the text input server needs to apply formatting to this range of text. The server populates this property before raising the event. */
    /* CompleteClass */
    var reason: CoreTextFormatUpdatingReason = js.native
    
    /** Gets or sets a value that indicates the result of handling the FormatUpdating event. The default value is Succeeded but if you can't action the operation as the text input server expects then before returning from the event handler set the property to the appropriate value to indicate what has happened. */
    /* CompleteClass */
    var result: CoreTextFormatUpdatingResult = js.native
    
    /** Gets a value that represents the text color to be applied to the text range. The text input server populates this property before raising the event. */
    /* CompleteClass */
    var textColor: UIElementType = js.native
    
    /** Gets a value that represents the underline color to be applied to the text range. The text input server populates this property before raising the event. */
    /* CompleteClass */
    var underlineColor: UIElementType = js.native
    
    /** Gets a value that represents the underline type to be applied to the text range. The text input server populates this property before raising the event. */
    /* CompleteClass */
    var underlineType: typingsJapgolly.winrtUwp.Windows.UI.Text.UnderlineType = js.native
  }
  
  /** Defines constants that specify the set of state applied during text composition. */
  @JSGlobal("Windows.UI.Text.Core.CoreTextFormatUpdatingReason")
  @js.native
  object CoreTextFormatUpdatingReason extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextFormatUpdatingReason & Double
      ] = js.native
    
    /* 2 */ val compositionConverted: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextFormatUpdatingReason.compositionConverted & Double = js.native
    
    /* 4 */ val compositionTargetConverted: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextFormatUpdatingReason.compositionTargetConverted & Double = js.native
    
    /* 3 */ val compositionTargetUnconverted: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextFormatUpdatingReason.compositionTargetUnconverted & Double = js.native
    
    /* 1 */ val compositionUnconverted: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextFormatUpdatingReason.compositionUnconverted & Double = js.native
    
    /* 0 */ val none: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextFormatUpdatingReason.none & Double = js.native
  }
  
  /** Defines constants that specify the result of handling the FormatUpdating event. */
  @JSGlobal("Windows.UI.Text.Core.CoreTextFormatUpdatingResult")
  @js.native
  object CoreTextFormatUpdatingResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextFormatUpdatingResult & Double
      ] = js.native
    
    /* 1 */ val failed: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextFormatUpdatingResult.failed & Double = js.native
    
    /* 0 */ val succeeded: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextFormatUpdatingResult.succeeded & Double = js.native
  }
  
  /** Defines constants that specify whether the input pane should be shown automatically when focus enters your text input control. */
  @JSGlobal("Windows.UI.Text.Core.CoreTextInputPaneDisplayPolicy")
  @js.native
  object CoreTextInputPaneDisplayPolicy extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputPaneDisplayPolicy & Double
      ] = js.native
    
    /* 0 */ val automatic: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputPaneDisplayPolicy.automatic & Double = js.native
    
    /* 1 */ val manual: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputPaneDisplayPolicy.manual & Double = js.native
  }
  
  /** Defines constants that specify the set of input scope names. Input scope is used by the text input server and input processors to determine the layout of the Soft Input Panel (SIP), and what type of language model to use. */
  @JSGlobal("Windows.UI.Text.Core.CoreTextInputScope")
  @js.native
  object CoreTextInputScope extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope & Double] = js.native
    
    /* 0 */ val default: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.default & Double = js.native
    
    /* 13 */ val address: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.address & Double = js.native
    
    /* 17 */ val addressCity: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.addressCity & Double = js.native
    
    /* 18 */ val addressCountryName: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.addressCountryName & Double = js.native
    
    /* 19 */ val addressCountryShortName: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.addressCountryShortName & Double = js.native
    
    /* 14 */ val addressPostalCode: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.addressPostalCode & Double = js.native
    
    /* 16 */ val addressStateOrProvince: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.addressStateOrProvince & Double = js.native
    
    /* 15 */ val addressStreet: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.addressStreet & Double = js.native
    
    /* 40 */ val alphanumericFullWidth: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.alphanumericFullWidth & Double = js.native
    
    /* 39 */ val alphanumericHalfWidth: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.alphanumericHalfWidth & Double = js.native
    
    /* 42 */ val bopomofo: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.bopomofo & Double = js.native
    
    /* 56 */ val chat: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.chat & Double = js.native
    
    /* 53 */ val chineseFullWidth: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.chineseFullWidth & Double = js.native
    
    /* 52 */ val chineseHalfWidth: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.chineseHalfWidth & Double = js.native
    
    /* 21 */ val currencyAmount: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.currencyAmount & Double = js.native
    
    /* 20 */ val currencyAmountAndSymbol: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.currencyAmountAndSymbol & Double = js.native
    
    /* 41 */ val currencyChinese: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.currencyChinese & Double = js.native
    
    /* 22 */ val date: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.date & Double = js.native
    
    /* 24 */ val dateDay: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.dateDay & Double = js.native
    
    /* 27 */ val dateDayName: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.dateDayName & Double = js.native
    
    /* 23 */ val dateMonth: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.dateMonth & Double = js.native
    
    /* 26 */ val dateMonthName: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.dateMonthName & Double = js.native
    
    /* 25 */ val dateYear: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.dateYear & Double = js.native
    
    /* 5 */ val emailAddress: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.emailAddress & Double = js.native
    
    /* 4 */ val emailUserName: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.emailUserName & Double = js.native
    
    /* 58 */ val emailUserNameOrAddress: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.emailUserNameOrAddress & Double = js.native
    
    /* 3 */ val fileName: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.fileName & Double = js.native
    
    /* 2 */ val filePath: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.filePath & Double = js.native
    
    /* 50 */ val formula: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.formula & Double = js.native
    
    /* 62 */ val formulaNumber: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.formulaNumber & Double = js.native
    
    /* 48 */ val hangulFullWidth: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.hangulFullWidth & Double = js.native
    
    /* 47 */ val hangulHalfWidth: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.hangulHalfWidth & Double = js.native
    
    /* 46 */ val hanja: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.hanja & Double = js.native
    
    /* 43 */ val hiragana: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.hiragana & Double = js.native
    
    /* 45 */ val katakanaFullWidth: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.katakanaFullWidth & Double = js.native
    
    /* 44 */ val katakanaHalfWidth: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.katakanaHalfWidth & Double = js.native
    
    /* 60 */ val maps: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.maps & Double = js.native
    
    /* 57 */ val nameOrPhoneNumber: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.nameOrPhoneNumber & Double = js.native
    
    /* 54 */ val nativeScript: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.nativeScript & Double = js.native
    
    /* 28 */ val number: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.number & Double = js.native
    
    /* 38 */ val numberFullWidth: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.numberFullWidth & Double = js.native
    
    /* 30 */ val password: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.password & Double = js.native
    
    /* 61 */ val passwordNumeric: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.passwordNumeric & Double = js.native
    
    /* 7 */ val personalFullName: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.personalFullName & Double = js.native
    
    /* 9 */ val personalGivenName: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.personalGivenName & Double = js.native
    
    /* 10 */ val personalMiddleName: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.personalMiddleName & Double = js.native
    
    /* 8 */ val personalNamePrefix: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.personalNamePrefix & Double = js.native
    
    /* 12 */ val personalNameSuffix: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.personalNameSuffix & Double = js.native
    
    /* 11 */ val personalSurname: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.personalSurname & Double = js.native
    
    /* 59 */ val `private`: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.`private` & Double = js.native
    
    /* 49 */ val search: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.search & Double = js.native
    
    /* 51 */ val searchIncremental: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.searchIncremental & Double = js.native
    
    /* 29 */ val singleCharacter: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.singleCharacter & Double = js.native
    
    /* 33 */ val telephoneAreaCode: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.telephoneAreaCode & Double = js.native
    
    /* 32 */ val telephoneCountryCode: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.telephoneCountryCode & Double = js.native
    
    /* 34 */ val telephoneLocalNumber: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.telephoneLocalNumber & Double = js.native
    
    /* 31 */ val telephoneNumber: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.telephoneNumber & Double = js.native
    
    /* 55 */ val text: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.text & Double = js.native
    
    /* 35 */ val time: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.time & Double = js.native
    
    /* 36 */ val timeHour: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.timeHour & Double = js.native
    
    /* 37 */ val timeMinuteOrSecond: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.timeMinuteOrSecond & Double = js.native
    
    /* 1 */ val url: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.url & Double = js.native
    
    /* 6 */ val userName: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextInputScope.userName & Double = js.native
  }
  
  /** Represents the bounding boxes—in screen coordinates—of a range of text, and of a text input control. */
  /* note: abstract class */ @JSGlobal("Windows.UI.Text.Core.CoreTextLayoutBounds")
  @js.native
  open class CoreTextLayoutBounds ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextLayoutBounds {
    
    /** Gets or sets the bounding box in screen coordinates of a text input control. */
    /* CompleteClass */
    var controlBounds: Rect = js.native
    
    /** Gets or sets the bounding box in screen coordinates of a range of text. */
    /* CompleteClass */
    var textBounds: Rect = js.native
  }
  
  /** Represents information about a LayoutRequested event. */
  /* note: abstract class */ @JSGlobal("Windows.UI.Text.Core.CoreTextLayoutRequest")
  @js.native
  open class CoreTextLayoutRequest ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextLayoutRequest {
    
    /**
      * Requests that the layout request operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
      * @return A Deferral object.
      */
    /* CompleteClass */
    override def getDeferral(): Deferral = js.native
    
    /** Gets a value that indicates whether the layout request operation is canceled. */
    /* CompleteClass */
    var isCanceled: Boolean = js.native
    
    /** Gets an object that represents the layout bounds information requested by the text input server. The application should populate the properties of this object to the layout bounds being requested before returning from the event handler. */
    /* CompleteClass */
    var layoutBounds: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextLayoutBounds = js.native
    
    /** Gets a value that indicates the range of text whose bounding box is being requested by the text input server. The server populates this property before raising the event. */
    /* CompleteClass */
    var range: CoreTextRange = js.native
  }
  
  /** Provides data for the LayoutRequested event. */
  /* note: abstract class */ @JSGlobal("Windows.UI.Text.Core.CoreTextLayoutRequestedEventArgs")
  @js.native
  open class CoreTextLayoutRequestedEventArgs ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextLayoutRequestedEventArgs {
    
    /** Gets information about a LayoutRequested event. */
    /* CompleteClass */
    var request: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextLayoutRequest = js.native
  }
  
  /** Represents information about a SelectionRequested event. */
  /* note: abstract class */ @JSGlobal("Windows.UI.Text.Core.CoreTextSelectionRequest")
  @js.native
  open class CoreTextSelectionRequest ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextSelectionRequest {
    
    /**
      * Requests that the selection request operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
      * @return A Deferral object.
      */
    /* CompleteClass */
    override def getDeferral(): Deferral = js.native
    
    /** Gets a value that indicates whether the selection request operation is canceled. */
    /* CompleteClass */
    var isCanceled: Boolean = js.native
    
    /** Gets or sets the selection range that the text input server is requesting. The application should set the current range of selection before returning from the event handler. */
    /* CompleteClass */
    var selection: CoreTextRange = js.native
  }
  
  /** Provides data for the SelectionRequested event. */
  /* note: abstract class */ @JSGlobal("Windows.UI.Text.Core.CoreTextSelectionRequestedEventArgs")
  @js.native
  open class CoreTextSelectionRequestedEventArgs ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextSelectionRequestedEventArgs {
    
    /** Gets information about a SelectionRequested event. */
    /* CompleteClass */
    var request: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextSelectionRequest = js.native
  }
  
  /** Provides data for the SelectionUpdating event. */
  /* note: abstract class */ @JSGlobal("Windows.UI.Text.Core.CoreTextSelectionUpdatingEventArgs")
  @js.native
  open class CoreTextSelectionUpdatingEventArgs ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextSelectionUpdatingEventArgs {
    
    /**
      * Requests that the selection update operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
      * @return A Deferral object.
      */
    /* CompleteClass */
    override def getDeferral(): Deferral = js.native
    
    /** Gets a value that indicates whether the selection update operation is canceled. */
    /* CompleteClass */
    var isCanceled: Boolean = js.native
    
    /** Gets or sets a value that indicates the result of handling the SelectionUpdating event. The default value is Succeeded but if you can't action the operation as the text input server expects then before returning from the event handler set the property to the appropriate value to indicate what has happened. */
    /* CompleteClass */
    var result: CoreTextSelectionUpdatingResult = js.native
    
    /** Gets a value that indicates the range of text that the text input server indicates should be selected. The server populates this property before raising the event. */
    /* CompleteClass */
    var selection: CoreTextRange = js.native
  }
  
  /** Defines constants that specify the result of handling the SelectionUpdating event. */
  @JSGlobal("Windows.UI.Text.Core.CoreTextSelectionUpdatingResult")
  @js.native
  object CoreTextSelectionUpdatingResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextSelectionUpdatingResult & Double
      ] = js.native
    
    /* 1 */ val failed: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextSelectionUpdatingResult.failed & Double = js.native
    
    /* 0 */ val succeeded: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextSelectionUpdatingResult.succeeded & Double = js.native
  }
  
  /** Provides constant values for use with the Windows core text APIs and the text input server. */
  /* note: abstract class */ @JSGlobal("Windows.UI.Text.Core.CoreTextServicesConstants")
  @js.native
  open class CoreTextServicesConstants ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextServicesConstants
  object CoreTextServicesConstants {
    
    @JSGlobal("Windows.UI.Text.Core.CoreTextServicesConstants")
    @js.native
    val ^ : js.Any = js.native
    
    /** Gets a value to use to replace hidden data inside a text stream before returning the text to the text input server. */
    /* static member */
    @JSGlobal("Windows.UI.Text.Core.CoreTextServicesConstants.hiddenCharacter")
    @js.native
    def hiddenCharacter: String = js.native
    inline def hiddenCharacter_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hiddenCharacter")(x.asInstanceOf[js.Any])
  }
  
  /** The entry point to all services provided by the Windows core text APIs and the text input server. This object is associated with an application's UI thread (the thread that CoreWindow runs on). */
  /* note: abstract class */ @JSGlobal("Windows.UI.Text.Core.CoreTextServicesManager")
  @js.native
  open class CoreTextServicesManager ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextServicesManager
  object CoreTextServicesManager {
    
    @JSGlobal("Windows.UI.Text.Core.CoreTextServicesManager")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets the CoreTextServicesManager object for the currently active view.
      * @return A CoreTextServicesManager instance, which can be used to create further objects to support the app's text input scenarios.
      */
    /* static member */
    inline def getForCurrentView(): typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextServicesManager = ^.asInstanceOf[js.Dynamic].applyDynamic("getForCurrentView")().asInstanceOf[typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextServicesManager]
  }
  
  /** Represents information about a TextRequested event. */
  /* note: abstract class */ @JSGlobal("Windows.UI.Text.Core.CoreTextTextRequest")
  @js.native
  open class CoreTextTextRequest ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextTextRequest {
    
    /**
      * Requests that the text request operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
      * @return A Deferral object.
      */
    /* CompleteClass */
    override def getDeferral(): Deferral = js.native
    
    /** Gets a value that indicates whether the text request operation is canceled. */
    /* CompleteClass */
    var isCanceled: Boolean = js.native
    
    /** Gets a value that indicates the range of text being requested by the text input server. The server populates this property before raising the event. */
    /* CompleteClass */
    var range: CoreTextRange = js.native
    
    /** Gets or sets the text that the text input server is requesting. The application should set the text being requested before returning from the event handler. */
    /* CompleteClass */
    var text: String = js.native
  }
  
  /** Provides data for the TextRequested event. */
  /* note: abstract class */ @JSGlobal("Windows.UI.Text.Core.CoreTextTextRequestedEventArgs")
  @js.native
  open class CoreTextTextRequestedEventArgs ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextTextRequestedEventArgs {
    
    /** Gets information about a TextRequested event. */
    /* CompleteClass */
    var request: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextTextRequest = js.native
  }
  
  /** Provides data for the TextUpdating event. */
  /* note: abstract class */ @JSGlobal("Windows.UI.Text.Core.CoreTextTextUpdatingEventArgs")
  @js.native
  open class CoreTextTextUpdatingEventArgs ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextTextUpdatingEventArgs {
    
    /**
      * Requests that the text update operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
      * @return A Deferral deferral object.
      */
    /* CompleteClass */
    override def getDeferral(): Deferral = js.native
    
    /** Gets a Language object representing the current input language. */
    /* CompleteClass */
    var inputLanguage: Language = js.native
    
    /** Gets a value that indicates whether the text update operation is canceled. */
    /* CompleteClass */
    var isCanceled: Boolean = js.native
    
    /** Gets a value that indicates the range of text that the text input server indicates should be selected. The server populates this property before raising the event. */
    /* CompleteClass */
    var newSelection: CoreTextRange = js.native
    
    /** Gets a value that indicates the range of text that the text input server needs to modify. The server populates this property before raising the event. */
    /* CompleteClass */
    var range: CoreTextRange = js.native
    
    /** Gets or sets a value that indicates the result of handling the TextUpdating event. The default value is Succeeded but if you can't action the operation as the text input server expects then before returning from the event handler set the property to the appropriate value to indicate what has happened. */
    /* CompleteClass */
    var result: CoreTextTextUpdatingResult = js.native
    
    /** Gets the text that the text input server is requesting to be set into the modified range. The server populates this property before raising the event. */
    /* CompleteClass */
    var text: String = js.native
  }
  
  /** Defines constants that specify the result of handling the TextUpdating event. */
  @JSGlobal("Windows.UI.Text.Core.CoreTextTextUpdatingResult")
  @js.native
  object CoreTextTextUpdatingResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextTextUpdatingResult & Double
      ] = js.native
    
    /* 1 */ val failed: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextTextUpdatingResult.failed & Double = js.native
    
    /* 0 */ val succeeded: typingsJapgolly.winrtUwp.Windows.UI.Text.Core.CoreTextTextUpdatingResult.succeeded & Double = js.native
  }
}
