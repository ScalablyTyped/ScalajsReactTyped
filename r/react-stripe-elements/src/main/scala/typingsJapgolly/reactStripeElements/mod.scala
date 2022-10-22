package typingsJapgolly.reactStripeElements

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactStripeElements.anon.ElementsCreateOptionschil
import typingsJapgolly.reactStripeElements.mod.ReactStripeElements.ElementProps
import typingsJapgolly.reactStripeElements.mod.ReactStripeElements.InjectOptions
import typingsJapgolly.reactStripeElements.mod.ReactStripeElements.InjectedStripeProps
import typingsJapgolly.reactStripeElements.mod.ReactStripeElements.PaymentRequestButtonElementProps
import typingsJapgolly.reactStripeElements.mod.ReactStripeElements.StripeProviderProps
import typingsJapgolly.stripeV3.stripe.BankAccountTokenOptions
import typingsJapgolly.stripeV3.stripe.CreatePaymentMethodOptions
import typingsJapgolly.stripeV3.stripe.HandleCardPaymentWithoutElementsOptions
import typingsJapgolly.stripeV3.stripe.HandleCardSetupOptions
import typingsJapgolly.stripeV3.stripe.PaymentIntentResponse
import typingsJapgolly.stripeV3.stripe.PaymentMethodData
import typingsJapgolly.stripeV3.stripe.PaymentMethodResponse
import typingsJapgolly.stripeV3.stripe.RetrieveSourceOptions
import typingsJapgolly.stripeV3.stripe.SetupIntentResponse
import typingsJapgolly.stripeV3.stripe.StripeClientCheckoutOptions
import typingsJapgolly.stripeV3.stripe.StripeRedirectResponse
import typingsJapgolly.stripeV3.stripe.elements.Element
import typingsJapgolly.stripeV3.stripe.paymentMethod.paymentMethodType
import typingsJapgolly.stripeV3.stripe.paymentRequest.StripePaymentRequest
import typingsJapgolly.stripeV3.stripe.paymentRequest.StripePaymentRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-stripe-elements", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-stripe-elements", "CardCVCElement")
  @js.native
  open class CardCVCElement_ protected () extends CardCvcElement {
    def this(props: ElementProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ElementProps, context: Any) = this()
  }
  
  @JSImport("react-stripe-elements", "CardCvcElement")
  @js.native
  open class CardCvcElement protected ()
    extends Component[ElementProps, js.Object, Any] {
    def this(props: ElementProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ElementProps, context: Any) = this()
  }
  
  @JSImport("react-stripe-elements", "CardElement")
  @js.native
  open class CardElement protected ()
    extends Component[ElementProps, js.Object, Any] {
    def this(props: ElementProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ElementProps, context: Any) = this()
  }
  
  @JSImport("react-stripe-elements", "CardExpiryElement")
  @js.native
  open class CardExpiryElement protected ()
    extends Component[ElementProps, js.Object, Any] {
    def this(props: ElementProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ElementProps, context: Any) = this()
  }
  
  @JSImport("react-stripe-elements", "CardNumberElement")
  @js.native
  open class CardNumberElement protected ()
    extends Component[ElementProps, js.Object, Any] {
    def this(props: ElementProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ElementProps, context: Any) = this()
  }
  
  @JSImport("react-stripe-elements", "Elements")
  @js.native
  open class Elements protected ()
    extends Component[ElementsCreateOptionschil, js.Object, Any] {
    def this(props: ElementsCreateOptionschil) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ElementsCreateOptionschil, context: Any) = this()
  }
  
  @JSImport("react-stripe-elements", "IbanElement")
  @js.native
  open class IbanElement protected ()
    extends Component[ElementProps, js.Object, Any] {
    def this(props: ElementProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ElementProps, context: Any) = this()
  }
  
  @JSImport("react-stripe-elements", "IdealBankElement")
  @js.native
  open class IdealBankElement protected ()
    extends Component[ElementProps, js.Object, Any] {
    def this(props: ElementProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ElementProps, context: Any) = this()
  }
  
  @JSImport("react-stripe-elements", "PaymentRequestButtonElement")
  @js.native
  open class PaymentRequestButtonElement protected ()
    extends Component[PaymentRequestButtonElementProps, js.Object, Any] {
    def this(props: PaymentRequestButtonElementProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PaymentRequestButtonElementProps, context: Any) = this()
  }
  
  @JSImport("react-stripe-elements", "PostalCodeElement")
  @js.native
  open class PostalCodeElement protected ()
    extends Component[ElementProps, js.Object, Any] {
    def this(props: ElementProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ElementProps, context: Any) = this()
  }
  
  @JSImport("react-stripe-elements", "StripeProvider")
  @js.native
  open class StripeProvider protected ()
    extends Component[StripeProviderProps, js.Object, Any] {
    def this(props: StripeProviderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: StripeProviderProps, context: Any) = this()
  }
  
  inline def injectStripe[P /* <: js.Object */](WrappedComponent: ComponentType[P & InjectedStripeProps]): ComponentType[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("injectStripe")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[ComponentType[P]]
  inline def injectStripe[P /* <: js.Object */](WrappedComponent: ComponentType[P & InjectedStripeProps], componentOptions: InjectOptions): ComponentType[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("injectStripe")(WrappedComponent.asInstanceOf[js.Any], componentOptions.asInstanceOf[js.Any])).asInstanceOf[ComponentType[P]]
  
  object ReactStripeElements {
    
    type ElementChangeResponse = typingsJapgolly.stripeV3.stripe.elements.ElementChangeResponse
    
    trait ElementProps
      extends StObject
         with typingsJapgolly.stripeV3.stripe.elements.ElementsOptions {
      
      var className: js.UndefOr[String] = js.undefined
      
      var elementRef: js.UndefOr[js.Function1[/* ref */ Any, Unit]] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var onBlur: js.UndefOr[js.Function1[/* event */ ElementChangeResponse, Unit]] = js.undefined
      
      var onChange: js.UndefOr[js.Function1[/* event */ ElementChangeResponse, Unit]] = js.undefined
      
      var onFocus: js.UndefOr[js.Function1[/* event */ ElementChangeResponse, Unit]] = js.undefined
      
      var onReady: js.UndefOr[js.Function1[/* el */ HTMLStripeElement, Unit]] = js.undefined
    }
    object ElementProps {
      
      inline def apply(): ElementProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ElementProps]
      }
      
      extension [Self <: ElementProps](x: Self) {
        
        inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        inline def setElementRef(value: /* ref */ Any => Callback): Self = StObject.set(x, "elementRef", js.Any.fromFunction1((t0: /* ref */ Any) => value(t0).runNow()))
        
        inline def setElementRefUndefined: Self = StObject.set(x, "elementRef", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setOnBlur(value: /* event */ ElementChangeResponse => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: /* event */ ElementChangeResponse) => value(t0).runNow()))
        
        inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
        
        inline def setOnChange(value: /* event */ ElementChangeResponse => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* event */ ElementChangeResponse) => value(t0).runNow()))
        
        inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
        
        inline def setOnFocus(value: /* event */ ElementChangeResponse => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: /* event */ ElementChangeResponse) => value(t0).runNow()))
        
        inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
        
        inline def setOnReady(value: /* el */ HTMLStripeElement => Callback): Self = StObject.set(x, "onReady", js.Any.fromFunction1((t0: /* el */ HTMLStripeElement) => value(t0).runNow()))
        
        inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
      }
    }
    
    type ElementsOptions = typingsJapgolly.stripeV3.stripe.elements.ElementsOptions
    
    type HTMLStripeElement = Element
    
    trait InjectOptions extends StObject {
      
      var withRef: js.UndefOr[Boolean] = js.undefined
    }
    object InjectOptions {
      
      inline def apply(): InjectOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[InjectOptions]
      }
      
      extension [Self <: InjectOptions](x: Self) {
        
        inline def setWithRef(value: Boolean): Self = StObject.set(x, "withRef", value.asInstanceOf[js.Any])
        
        inline def setWithRefUndefined: Self = StObject.set(x, "withRef", js.undefined)
      }
    }
    
    trait InjectedStripeProps extends StObject {
      
      var elements: typingsJapgolly.stripeV3.stripe.elements.Elements | Null
      
      var stripe: StripeProps | Null
    }
    object InjectedStripeProps {
      
      inline def apply(): InjectedStripeProps = {
        val __obj = js.Dynamic.literal(elements = null, stripe = null)
        __obj.asInstanceOf[InjectedStripeProps]
      }
      
      extension [Self <: InjectedStripeProps](x: Self) {
        
        inline def setElements(value: typingsJapgolly.stripeV3.stripe.elements.Elements): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
        
        inline def setElementsNull: Self = StObject.set(x, "elements", null)
        
        inline def setStripe(value: StripeProps): Self = StObject.set(x, "stripe", value.asInstanceOf[js.Any])
        
        inline def setStripeNull: Self = StObject.set(x, "stripe", null)
      }
    }
    
    trait PaymentRequestButtonElementProps
      extends StObject
         with ElementProps {
      
      var onClick: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    }
    object PaymentRequestButtonElementProps {
      
      inline def apply(): PaymentRequestButtonElementProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PaymentRequestButtonElementProps]
      }
      
      extension [Self <: PaymentRequestButtonElementProps](x: Self) {
        
        inline def setOnClick(value: /* event */ Any => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* event */ Any) => value(t0).runNow()))
        
        inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      }
    }
    
    type SourceOptions = typingsJapgolly.stripeV3.stripe.SourceOptions
    
    type SourceResponse = typingsJapgolly.stripeV3.stripe.SourceResponse
    
    @js.native
    trait StripeOverrideProps extends StObject {
      
      def createPaymentMethod(data: PaymentMethodData): js.Promise[PaymentMethodResponse] = js.native
      def createPaymentMethod(paymentMethodType: paymentMethodType): js.Promise[PaymentMethodResponse] = js.native
      def createPaymentMethod(paymentMethodType: paymentMethodType, data: CreatePaymentMethodOptions): js.Promise[PaymentMethodResponse] = js.native
      def createPaymentMethod(paymentMethodType: paymentMethodType, element: HTMLStripeElement): js.Promise[PaymentMethodResponse] = js.native
      def createPaymentMethod(paymentMethodType: paymentMethodType, element: HTMLStripeElement, data: CreatePaymentMethodOptions): js.Promise[PaymentMethodResponse] = js.native
      
      def createSource(): js.Promise[SourceResponse] = js.native
      def createSource(sourceData: SourceOptions): js.Promise[SourceResponse] = js.native
      
      /*
        * react-stripe-elements let's you use the same createToken function
        * with either credit card or bank account options
        * which one to choose depends solely on the inferred elements and can't be expressed in TypeScript
        */
      def createToken(): js.Promise[TokenResponse] = js.native
      def createToken(options: TokenOptions): js.Promise[TokenResponse] = js.native
      def createToken(options: BankAccountTokenOptions): js.Promise[TokenResponse] = js.native
      
      def handleCardPayment(clientSecret: String): js.Promise[PaymentIntentResponse] = js.native
      def handleCardPayment(clientSecret: String, options: HandleCardPaymentWithoutElementsOptions): js.Promise[PaymentIntentResponse] = js.native
      
      def handleCardSetup(clientSecret: String): js.Promise[SetupIntentResponse] = js.native
      def handleCardSetup(clientSecret: String, data: HandleCardSetupOptions): js.Promise[SetupIntentResponse] = js.native
    }
    
    /* Inlined parent std.Omit<stripe-v3.stripe.Stripe, keyof react-stripe-elements.react-stripe-elements.ReactStripeElements.StripeOverrideProps> */
    /* Inlined parent react-stripe-elements.react-stripe-elements.ReactStripeElements.StripeOverrideProps */
    @js.native
    trait StripeProps extends StObject {
      
      var confirmAuBecsDebitPayment: js.Function1[/* clientSecret */ String, js.Promise[PaymentIntentResponse]] = js.native
      
      var confirmCardPayment: js.Function1[/* clientSecret */ String, js.Promise[PaymentIntentResponse]] = js.native
      
      var confirmCardSetup: js.Function1[/* clientSecret */ String, js.Promise[SetupIntentResponse]] = js.native
      
      var confirmPaymentIntent: js.Function2[/* clientSecret */ String, /* element */ Element, js.Promise[PaymentIntentResponse]] = js.native
      
      var confirmSepaDebitPayment: js.Function1[/* clientSecret */ String, js.Promise[PaymentIntentResponse]] = js.native
      
      var confirmSepaDebitSetup: js.Function1[/* clientSecret */ String, js.Promise[SetupIntentResponse]] = js.native
      
      var confirmSofortPayment: js.Function1[/* clientSecret */ String, js.Promise[PaymentIntentResponse]] = js.native
      
      def createPaymentMethod(data: PaymentMethodData): js.Promise[PaymentMethodResponse] = js.native
      def createPaymentMethod(paymentMethodType: paymentMethodType): js.Promise[PaymentMethodResponse] = js.native
      def createPaymentMethod(paymentMethodType: paymentMethodType, data: CreatePaymentMethodOptions): js.Promise[PaymentMethodResponse] = js.native
      def createPaymentMethod(paymentMethodType: paymentMethodType, element: HTMLStripeElement): js.Promise[PaymentMethodResponse] = js.native
      def createPaymentMethod(paymentMethodType: paymentMethodType, element: HTMLStripeElement, data: CreatePaymentMethodOptions): js.Promise[PaymentMethodResponse] = js.native
      
      def createSource(): js.Promise[SourceResponse] = js.native
      def createSource(sourceData: SourceOptions): js.Promise[SourceResponse] = js.native
      
      /*
        * react-stripe-elements let's you use the same createToken function
        * with either credit card or bank account options
        * which one to choose depends solely on the inferred elements and can't be expressed in TypeScript
        */
      def createToken(): js.Promise[TokenResponse] = js.native
      def createToken(options: TokenOptions): js.Promise[TokenResponse] = js.native
      def createToken(options: BankAccountTokenOptions): js.Promise[TokenResponse] = js.native
      
      var elements: js.Function0[typingsJapgolly.stripeV3.stripe.elements.Elements] = js.native
      
      var handleCardAction: js.Function1[/* clientSecret */ String, js.Promise[PaymentIntentResponse]] = js.native
      
      def handleCardPayment(clientSecret: String): js.Promise[PaymentIntentResponse] = js.native
      def handleCardPayment(clientSecret: String, options: HandleCardPaymentWithoutElementsOptions): js.Promise[PaymentIntentResponse] = js.native
      
      def handleCardSetup(clientSecret: String): js.Promise[SetupIntentResponse] = js.native
      def handleCardSetup(clientSecret: String, data: HandleCardSetupOptions): js.Promise[SetupIntentResponse] = js.native
      
      var paymentRequest: js.Function1[/* options */ StripePaymentRequestOptions, StripePaymentRequest] = js.native
      
      var redirectToCheckout: js.Function1[/* options */ StripeClientCheckoutOptions, js.Promise[StripeRedirectResponse]] = js.native
      
      var retrievePaymentIntent: js.Function1[/* clientSecret */ String, js.Promise[PaymentIntentResponse]] = js.native
      
      var retrieveSetupIntent: js.Function1[/* clientSecret */ String, js.Promise[SetupIntentResponse]] = js.native
      
      var retrieveSource: js.Function1[
            /* options */ RetrieveSourceOptions, 
            js.Promise[typingsJapgolly.stripeV3.stripe.SourceResponse]
          ] = js.native
    }
    
    trait StripeProviderOptions extends StObject {
      
      var stripeAccount: js.UndefOr[String] = js.undefined
    }
    object StripeProviderOptions {
      
      inline def apply(): StripeProviderOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StripeProviderOptions]
      }
      
      extension [Self <: StripeProviderOptions](x: Self) {
        
        inline def setStripeAccount(value: String): Self = StObject.set(x, "stripeAccount", value.asInstanceOf[js.Any])
        
        inline def setStripeAccountUndefined: Self = StObject.set(x, "stripeAccount", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.reactStripeElements.anon.childrenReactNodeundefine
      - typingsJapgolly.reactStripeElements.anon.childrenReactNodeundefineApiKey
    */
    trait StripeProviderProps extends StObject
    object StripeProviderProps {
      
      inline def childrenReactNodeundefine(apiKey: String): typingsJapgolly.reactStripeElements.anon.childrenReactNodeundefine = {
        val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.reactStripeElements.anon.childrenReactNodeundefine]
      }
      
      inline def childrenReactNodeundefineApiKey(): typingsJapgolly.reactStripeElements.anon.childrenReactNodeundefineApiKey = {
        val __obj = js.Dynamic.literal(stripe = null)
        __obj.asInstanceOf[typingsJapgolly.reactStripeElements.anon.childrenReactNodeundefineApiKey]
      }
    }
    
    trait TokenOptions
      extends StObject
         with typingsJapgolly.stripeV3.stripe.TokenOptions {
      
      var `type`: js.UndefOr[TokenType] = js.undefined
    }
    object TokenOptions {
      
      inline def apply(): TokenOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TokenOptions]
      }
      
      extension [Self <: TokenOptions](x: Self) {
        
        inline def setType(value: TokenType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    type TokenResponse = typingsJapgolly.stripeV3.stripe.TokenResponse
    
    // From https://stripe.com/docs/stripe-js/reference#element-types
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.reactStripeElements.reactStripeElementsStrings.card
      - typingsJapgolly.reactStripeElements.reactStripeElementsStrings.cardNumber
      - typingsJapgolly.reactStripeElements.reactStripeElementsStrings.cardExpiry
      - typingsJapgolly.reactStripeElements.reactStripeElementsStrings.cardCvc
      - typingsJapgolly.reactStripeElements.reactStripeElementsStrings.paymentRequestButton
      - typingsJapgolly.reactStripeElements.reactStripeElementsStrings.iban
      - typingsJapgolly.reactStripeElements.reactStripeElementsStrings.idealBank
    */
    trait TokenType extends StObject
    object TokenType {
      
      inline def card: typingsJapgolly.reactStripeElements.reactStripeElementsStrings.card = "card".asInstanceOf[typingsJapgolly.reactStripeElements.reactStripeElementsStrings.card]
      
      inline def cardCvc: typingsJapgolly.reactStripeElements.reactStripeElementsStrings.cardCvc = "cardCvc".asInstanceOf[typingsJapgolly.reactStripeElements.reactStripeElementsStrings.cardCvc]
      
      inline def cardExpiry: typingsJapgolly.reactStripeElements.reactStripeElementsStrings.cardExpiry = "cardExpiry".asInstanceOf[typingsJapgolly.reactStripeElements.reactStripeElementsStrings.cardExpiry]
      
      inline def cardNumber: typingsJapgolly.reactStripeElements.reactStripeElementsStrings.cardNumber = "cardNumber".asInstanceOf[typingsJapgolly.reactStripeElements.reactStripeElementsStrings.cardNumber]
      
      inline def iban: typingsJapgolly.reactStripeElements.reactStripeElementsStrings.iban = "iban".asInstanceOf[typingsJapgolly.reactStripeElements.reactStripeElementsStrings.iban]
      
      inline def idealBank: typingsJapgolly.reactStripeElements.reactStripeElementsStrings.idealBank = "idealBank".asInstanceOf[typingsJapgolly.reactStripeElements.reactStripeElementsStrings.idealBank]
      
      inline def paymentRequestButton: typingsJapgolly.reactStripeElements.reactStripeElementsStrings.paymentRequestButton = "paymentRequestButton".asInstanceOf[typingsJapgolly.reactStripeElements.reactStripeElementsStrings.paymentRequestButton]
    }
  }
}
