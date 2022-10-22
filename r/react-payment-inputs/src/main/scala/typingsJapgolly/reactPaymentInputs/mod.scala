package typingsJapgolly.reactPaymentInputs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.react.mod.ChangeEventHandler
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.FocusEventHandler
import typingsJapgolly.reactPaymentInputs.anon.Arialabel
import typingsJapgolly.reactPaymentInputs.anon.AutoComplete
import typingsJapgolly.reactPaymentInputs.anon.CardNumberCardType
import typingsJapgolly.reactPaymentInputs.anon.Error
import typingsJapgolly.reactPaymentInputs.anon.ErrorText
import typingsJapgolly.reactPaymentInputs.anon.ExpiryDate
import typingsJapgolly.reactPaymentInputs.anon.Id
import typingsJapgolly.reactPaymentInputs.anon.Images
import typingsJapgolly.reactPaymentInputs.anon.Length
import typingsJapgolly.reactPaymentInputs.anon.Name
import typingsJapgolly.reactPaymentInputs.anon.OnBlur
import typingsJapgolly.reactPaymentInputs.anon.OnChange
import typingsJapgolly.reactPaymentInputs.anon.OnFocus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-payment-inputs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-payment-inputs", "PaymentInputsContainer")
  @js.native
  val PaymentInputsContainer: FC[usePaymentInputsOptions] = js.native
  
  @JSImport("react-payment-inputs", "PaymentInputsWrapper")
  @js.native
  val PaymentInputsWrapper: FC[PaymentInputsWrapperProps] = js.native
  
  inline def getCVCError(
    cvc: String,
    cvcValidator: js.Function1[/* props */ typingsJapgolly.reactPaymentInputs.anon.CardType, String],
    hasErrorMessages: typingsJapgolly.reactPaymentInputs.anon.ErrorMessages
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getCVCError")(cvc.asInstanceOf[js.Any], cvcValidator.asInstanceOf[js.Any], hasErrorMessages.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getCardNumberError(
    cardNumber: String,
    cardNumberValidator: js.Function1[/* props */ CardNumberCardType, String],
    hasErrorMessages: typingsJapgolly.reactPaymentInputs.anon.ErrorMessages
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getCardNumberError")(cardNumber.asInstanceOf[js.Any], cardNumberValidator.asInstanceOf[js.Any], hasErrorMessages.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getExpiryDateError(
    expiryDate: String,
    expiryValidator: js.Function1[/* props */ ExpiryDate, String],
    hasErrorMessages: typingsJapgolly.reactPaymentInputs.anon.ErrorMessages
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getExpiryDateError")(expiryDate.asInstanceOf[js.Any], expiryValidator.asInstanceOf[js.Any], hasErrorMessages.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getZIPError(zip: String, hasErrorMessages: typingsJapgolly.reactPaymentInputs.anon.ErrorMessages): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getZIPError")(zip.asInstanceOf[js.Any], hasErrorMessages.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def usePaymentInputs(): usePaymentInputsData = ^.asInstanceOf[js.Dynamic].applyDynamic("usePaymentInputs")().asInstanceOf[usePaymentInputsData]
  inline def usePaymentInputs(options: usePaymentInputsOptions): usePaymentInputsData = ^.asInstanceOf[js.Dynamic].applyDynamic("usePaymentInputs")(options.asInstanceOf[js.Any]).asInstanceOf[usePaymentInputsData]
  
  trait CardImages extends StObject {
    
    var amex: Element
    
    var dinersclub: Element
    
    var discover: Element
    
    var hipercard: Element
    
    var jcb: Element
    
    var mastercard: Element
    
    var placeholder: Element
    
    var unionpay: Element
    
    var visa: Element
  }
  object CardImages {
    
    inline def apply(
      amex: VdomElement,
      dinersclub: VdomElement,
      discover: VdomElement,
      hipercard: VdomElement,
      jcb: VdomElement,
      mastercard: VdomElement,
      placeholder: VdomElement,
      unionpay: VdomElement,
      visa: VdomElement
    ): CardImages = {
      val __obj = js.Dynamic.literal(amex = amex.rawElement.asInstanceOf[js.Any], dinersclub = dinersclub.rawElement.asInstanceOf[js.Any], discover = discover.rawElement.asInstanceOf[js.Any], hipercard = hipercard.rawElement.asInstanceOf[js.Any], jcb = jcb.rawElement.asInstanceOf[js.Any], mastercard = mastercard.rawElement.asInstanceOf[js.Any], placeholder = placeholder.rawElement.asInstanceOf[js.Any], unionpay = unionpay.rawElement.asInstanceOf[js.Any], visa = visa.rawElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardImages]
    }
    
    extension [Self <: CardImages](x: Self) {
      
      inline def setAmex(value: VdomElement): Self = StObject.set(x, "amex", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDinersclub(value: VdomElement): Self = StObject.set(x, "dinersclub", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDiscover(value: VdomElement): Self = StObject.set(x, "discover", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHipercard(value: VdomElement): Self = StObject.set(x, "hipercard", value.rawElement.asInstanceOf[js.Any])
      
      inline def setJcb(value: VdomElement): Self = StObject.set(x, "jcb", value.rawElement.asInstanceOf[js.Any])
      
      inline def setMastercard(value: VdomElement): Self = StObject.set(x, "mastercard", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPlaceholder(value: VdomElement): Self = StObject.set(x, "placeholder", value.rawElement.asInstanceOf[js.Any])
      
      inline def setUnionpay(value: VdomElement): Self = StObject.set(x, "unionpay", value.rawElement.asInstanceOf[js.Any])
      
      inline def setVisa(value: VdomElement): Self = StObject.set(x, "visa", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait CardType extends StObject {
    
    var code: Length
    
    var displayName: String
    
    var format: js.RegExp
    
    var gaps: js.Array[Double]
    
    var lengths: js.Array[Double]
    
    var startPattern: js.RegExp
    
    var `type`: String
  }
  object CardType {
    
    inline def apply(
      code: Length,
      displayName: String,
      format: js.RegExp,
      gaps: js.Array[Double],
      lengths: js.Array[Double],
      startPattern: js.RegExp,
      `type`: String
    ): CardType = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], gaps = gaps.asInstanceOf[js.Any], lengths = lengths.asInstanceOf[js.Any], startPattern = startPattern.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardType]
    }
    
    extension [Self <: CardType](x: Self) {
      
      inline def setCode(value: Length): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: js.RegExp): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setGaps(value: js.Array[Double]): Self = StObject.set(x, "gaps", value.asInstanceOf[js.Any])
      
      inline def setGapsVarargs(value: Double*): Self = StObject.set(x, "gaps", js.Array(value*))
      
      inline def setLengths(value: js.Array[Double]): Self = StObject.set(x, "lengths", value.asInstanceOf[js.Any])
      
      inline def setLengthsVarargs(value: Double*): Self = StObject.set(x, "lengths", js.Array(value*))
      
      inline def setStartPattern(value: js.RegExp): Self = StObject.set(x, "startPattern", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ErrorMessages extends StObject {
    
    var dateOutOfRange: String
    
    var emptyCVC: String
    
    var emptyCardNumber: String
    
    var emptyExpiryDate: String
    
    var invalidCVC: String
    
    var invalidCardNumber: String
    
    var invalidExpiryDate: String
    
    var monthOutOfRange: String
    
    var yearOutOfRange: String
  }
  object ErrorMessages {
    
    inline def apply(
      dateOutOfRange: String,
      emptyCVC: String,
      emptyCardNumber: String,
      emptyExpiryDate: String,
      invalidCVC: String,
      invalidCardNumber: String,
      invalidExpiryDate: String,
      monthOutOfRange: String,
      yearOutOfRange: String
    ): ErrorMessages = {
      val __obj = js.Dynamic.literal(dateOutOfRange = dateOutOfRange.asInstanceOf[js.Any], emptyCVC = emptyCVC.asInstanceOf[js.Any], emptyCardNumber = emptyCardNumber.asInstanceOf[js.Any], emptyExpiryDate = emptyExpiryDate.asInstanceOf[js.Any], invalidCVC = invalidCVC.asInstanceOf[js.Any], invalidCardNumber = invalidCardNumber.asInstanceOf[js.Any], invalidExpiryDate = invalidExpiryDate.asInstanceOf[js.Any], monthOutOfRange = monthOutOfRange.asInstanceOf[js.Any], yearOutOfRange = yearOutOfRange.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorMessages]
    }
    
    extension [Self <: ErrorMessages](x: Self) {
      
      inline def setDateOutOfRange(value: String): Self = StObject.set(x, "dateOutOfRange", value.asInstanceOf[js.Any])
      
      inline def setEmptyCVC(value: String): Self = StObject.set(x, "emptyCVC", value.asInstanceOf[js.Any])
      
      inline def setEmptyCardNumber(value: String): Self = StObject.set(x, "emptyCardNumber", value.asInstanceOf[js.Any])
      
      inline def setEmptyExpiryDate(value: String): Self = StObject.set(x, "emptyExpiryDate", value.asInstanceOf[js.Any])
      
      inline def setInvalidCVC(value: String): Self = StObject.set(x, "invalidCVC", value.asInstanceOf[js.Any])
      
      inline def setInvalidCardNumber(value: String): Self = StObject.set(x, "invalidCardNumber", value.asInstanceOf[js.Any])
      
      inline def setInvalidExpiryDate(value: String): Self = StObject.set(x, "invalidExpiryDate", value.asInstanceOf[js.Any])
      
      inline def setMonthOutOfRange(value: String): Self = StObject.set(x, "monthOutOfRange", value.asInstanceOf[js.Any])
      
      inline def setYearOutOfRange(value: String): Self = StObject.set(x, "yearOutOfRange", value.asInstanceOf[js.Any])
    }
  }
  
  trait ErroredInputs extends StObject {
    
    var cardNumber: String
    
    var cvc: String
    
    var expiryDate: String
    
    var zipField: String
  }
  object ErroredInputs {
    
    inline def apply(cardNumber: String, cvc: String, expiryDate: String, zipField: String): ErroredInputs = {
      val __obj = js.Dynamic.literal(cardNumber = cardNumber.asInstanceOf[js.Any], cvc = cvc.asInstanceOf[js.Any], expiryDate = expiryDate.asInstanceOf[js.Any], zipField = zipField.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErroredInputs]
    }
    
    extension [Self <: ErroredInputs](x: Self) {
      
      inline def setCardNumber(value: String): Self = StObject.set(x, "cardNumber", value.asInstanceOf[js.Any])
      
      inline def setCvc(value: String): Self = StObject.set(x, "cvc", value.asInstanceOf[js.Any])
      
      inline def setExpiryDate(value: String): Self = StObject.set(x, "expiryDate", value.asInstanceOf[js.Any])
      
      inline def setZipField(value: String): Self = StObject.set(x, "zipField", value.asInstanceOf[js.Any])
    }
  }
  
  type InputValidationErrorCallback = js.Function2[/* error */ String, /* erroredInputs */ ErroredInputs, Unit]
  
  trait PaymentInputsWrapperProps extends StObject {
    
    var children: Node
    
    var error: String
    
    /**
      * Custom props to pass to the error text component.
      */
    var errorTextProps: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var focused: Boolean
    
    /**
      * Custom props to pass to the input wrapper component.
      */
    var inputWrapperProps: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var isTouched: Boolean
    
    /**
      * Custom styling to pass through to the wrapper. Either a styled-component's css or an Object can be passed.
      */
    var styles: js.UndefOr[ErrorText] = js.undefined
  }
  object PaymentInputsWrapperProps {
    
    inline def apply(error: String, focused: Boolean, isTouched: Boolean): PaymentInputsWrapperProps = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], isTouched = isTouched.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[PaymentInputsWrapperProps]
    }
    
    extension [Self <: PaymentInputsWrapperProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorTextProps(value: StringDictionary[Any]): Self = StObject.set(x, "errorTextProps", value.asInstanceOf[js.Any])
      
      inline def setErrorTextPropsUndefined: Self = StObject.set(x, "errorTextProps", js.undefined)
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setInputWrapperProps(value: StringDictionary[Any]): Self = StObject.set(x, "inputWrapperProps", value.asInstanceOf[js.Any])
      
      inline def setInputWrapperPropsUndefined: Self = StObject.set(x, "inputWrapperProps", js.undefined)
      
      inline def setIsTouched(value: Boolean): Self = StObject.set(x, "isTouched", value.asInstanceOf[js.Any])
      
      inline def setStyles(value: ErrorText): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  @js.native
  trait usePaymentInputsData extends StObject {
    
    /**
      * Returns the props to apply to the CVC input.
      */
    def getCVCProps(): Id = js.native
    def getCVCProps(props: OnFocus): Id = js.native
    
    /**
      * Returns the props to apply to the card image SVG.
      */
    def getCardImageProps(): Arialabel = js.native
    def getCardImageProps(props: Images): Arialabel = js.native
    
    /**
      * Returns the props to apply to the card number input.
      */
    def getCardNumberProps(): AutoComplete = js.native
    def getCardNumberProps(props: OnBlur): AutoComplete = js.native
    
    /**
      * Returns the props to apply to the expiry date input.
      */
    def getExpiryDateProps(): Id = js.native
    def getExpiryDateProps(props: OnChange): Id = js.native
    
    /**
      * Returns the props to apply to the ZIP input.
      */
    def getZipProps(): Name = js.native
    def getZipProps(props: OnChange): Name = js.native
    
    var meta: typingsJapgolly.reactPaymentInputs.anon.ErroredInputs = js.native
    
    /**
      * Returns the props to apply to <PaymentInputsWrapper>.
      */
    var wrapperProps: Error = js.native
  }
  
  trait usePaymentInputsOptions extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set custom card number validator function
      */
    var cardNumberValidator: js.UndefOr[js.Function1[/* props */ CardNumberCardType, String]] = js.undefined
    
    /**
      * Set custom cvc validator function
      */
    var cvcValidator: js.UndefOr[
        js.Function1[/* props */ typingsJapgolly.reactPaymentInputs.anon.CardType, String]
      ] = js.undefined
    
    /**
      * custom error messages for the inputs.
      */
    var errorMessages: js.UndefOr[ErrorMessages] = js.undefined
    
    /**
      * Set expiry validator function
      */
    var expiryValidator: js.UndefOr[js.Function1[/* props */ ExpiryDate, String]] = js.undefined
    
    /**
      * Function to handle the blur event on the inputs. It is invoked when any of the inputs blur.
      */
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    /**
      * Function to handle the change event on the inputs. It is invoked when any of the inputs change.
      */
    var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
    
    /**
      * Function to invoke when any of the inputs error.
      */
    var onError: js.UndefOr[InputValidationErrorCallback] = js.undefined
    
    /**
      * Function to invoke when any of the inputs are touched.
      */
    var onTouch: js.UndefOr[Any] = js.undefined
  }
  object usePaymentInputsOptions {
    
    inline def apply(): usePaymentInputsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[usePaymentInputsOptions]
    }
    
    extension [Self <: usePaymentInputsOptions](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setCardNumberValidator(value: /* props */ CardNumberCardType => String): Self = StObject.set(x, "cardNumberValidator", js.Any.fromFunction1(value))
      
      inline def setCardNumberValidatorUndefined: Self = StObject.set(x, "cardNumberValidator", js.undefined)
      
      inline def setCvcValidator(value: /* props */ typingsJapgolly.reactPaymentInputs.anon.CardType => String): Self = StObject.set(x, "cvcValidator", js.Any.fromFunction1(value))
      
      inline def setCvcValidatorUndefined: Self = StObject.set(x, "cvcValidator", js.undefined)
      
      inline def setErrorMessages(value: ErrorMessages): Self = StObject.set(x, "errorMessages", value.asInstanceOf[js.Any])
      
      inline def setErrorMessagesUndefined: Self = StObject.set(x, "errorMessages", js.undefined)
      
      inline def setExpiryValidator(value: /* props */ ExpiryDate => String): Self = StObject.set(x, "expiryValidator", js.Any.fromFunction1(value))
      
      inline def setExpiryValidatorUndefined: Self = StObject.set(x, "expiryValidator", js.undefined)
      
      inline def setOnBlur(value: ReactFocusEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: ReactEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnError(value: (/* error */ String, /* erroredInputs */ ErroredInputs) => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction2((t0: /* error */ String, t1: /* erroredInputs */ ErroredInputs) => (value(t0, t1)).runNow()))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnTouch(value: Any): Self = StObject.set(x, "onTouch", value.asInstanceOf[js.Any])
      
      inline def setOnTouchUndefined: Self = StObject.set(x, "onTouch", js.undefined)
    }
  }
}
