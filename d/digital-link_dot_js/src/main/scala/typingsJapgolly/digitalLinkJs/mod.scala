package typingsJapgolly.digitalLinkJs

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.digitalLinkJs.anon.Match
import typingsJapgolly.digitalLinkJs.anon.RecordRuleNamestring
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait DigitalLink extends StObject {
    
    def getAttribute(key: String): js.UndefOr[String]
    
    def getAttributes(): Record[String, String]
    
    def getDomain(): String
    
    def getIdentifier(): Record[String, String]
    
    def getKeyQualifier(key: String): js.UndefOr[String]
    
    def getKeyQualifiers(): Record[String, String]
    
    def getKeyQualifiersOrder(): js.Array[String]
    
    def getSortKeyQualifiers(): Boolean
    
    def getValidationTrace(): ValidationTrace
    
    def isValid(): Boolean
    
    /**
      * Set an attribute of the Digital Link
      *
      * @param key - The attribute code
      * @param value - The attribute value
      * @returns the dl instance
      */
    def setAttribute(key: String, value: String): this.type
    
    /**
      * Set the domain of the Digital Link
      *
      * @param value - The domain
      * @returns the dl instance
      */
    def setDomain(value: String): this.type
    
    /**
      * Set the identifier of the Digital Link
      *
      * @param key - The identifier code
      * @param value - The identifier value
      * @returns the dl instance
      */
    def setIdentifier(key: String, value: String): this.type
    
    /**
      * Set a key qualifier of the Digital Link
      *
      * @param key - The key qualifier code
      * @param value - The key qualifier value
      * @returns the dl instance
      */
    def setKeyQualifier(key: String, value: String): this.type
    
    /**
      * Setter for the field keyQualifiersOrder
      *
      * @param value - The list containing all the key qualifiers in the desired order
      * @returns the dl instance
      */
    def setKeyQualifiersOrder(value: js.Array[String]): this.type
    
    /**
      * Setter for the field sortKeyQualifiers
      * If you set it to true, the key qualifiers will be sorted automatically following the grammar
      * Otherwise, they won't
      *
      * @param value
      * @returns the dl instance
      */
    def setSortKeyQualifiers(value: Boolean): this.type
    
    def toCompressedWebUriString(): String
    
    def toJsonString(): String
    
    def toWebUriString(): String
  }
  object DigitalLink {
    
    @JSImport("digital-link.js", "DigitalLink")
    @js.native
    def apply(): DigitalLink = js.native
    @JSImport("digital-link.js", "DigitalLink")
    @js.native
    def apply(input: String): DigitalLink = js.native
    @JSImport("digital-link.js", "DigitalLink")
    @js.native
    def apply(input: DigitalLinkInput): DigitalLink = js.native
    
    extension [Self <: DigitalLink](x: Self) {
      
      inline def setGetAttribute(value: String => js.UndefOr[String]): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
      
      inline def setGetAttributes(value: CallbackTo[Record[String, String]]): Self = StObject.set(x, "getAttributes", value.toJsFn)
      
      inline def setGetDomain(value: CallbackTo[String]): Self = StObject.set(x, "getDomain", value.toJsFn)
      
      inline def setGetIdentifier(value: CallbackTo[Record[String, String]]): Self = StObject.set(x, "getIdentifier", value.toJsFn)
      
      inline def setGetKeyQualifier(value: String => js.UndefOr[String]): Self = StObject.set(x, "getKeyQualifier", js.Any.fromFunction1(value))
      
      inline def setGetKeyQualifiers(value: CallbackTo[Record[String, String]]): Self = StObject.set(x, "getKeyQualifiers", value.toJsFn)
      
      inline def setGetKeyQualifiersOrder(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getKeyQualifiersOrder", value.toJsFn)
      
      inline def setGetSortKeyQualifiers(value: CallbackTo[Boolean]): Self = StObject.set(x, "getSortKeyQualifiers", value.toJsFn)
      
      inline def setGetValidationTrace(value: CallbackTo[ValidationTrace]): Self = StObject.set(x, "getValidationTrace", value.toJsFn)
      
      inline def setIsValid(value: CallbackTo[Boolean]): Self = StObject.set(x, "isValid", value.toJsFn)
      
      inline def setSetAttribute(value: (String, String) => DigitalLink): Self = StObject.set(x, "setAttribute", js.Any.fromFunction2(value))
      
      inline def setSetDomain(value: String => DigitalLink): Self = StObject.set(x, "setDomain", js.Any.fromFunction1(value))
      
      inline def setSetIdentifier(value: (String, String) => DigitalLink): Self = StObject.set(x, "setIdentifier", js.Any.fromFunction2(value))
      
      inline def setSetKeyQualifier(value: (String, String) => DigitalLink): Self = StObject.set(x, "setKeyQualifier", js.Any.fromFunction2(value))
      
      inline def setSetKeyQualifiersOrder(value: js.Array[String] => DigitalLink): Self = StObject.set(x, "setKeyQualifiersOrder", js.Any.fromFunction1(value))
      
      inline def setSetSortKeyQualifiers(value: Boolean => DigitalLink): Self = StObject.set(x, "setSortKeyQualifiers", js.Any.fromFunction1(value))
      
      inline def setToCompressedWebUriString(value: CallbackTo[String]): Self = StObject.set(x, "toCompressedWebUriString", value.toJsFn)
      
      inline def setToJsonString(value: CallbackTo[String]): Self = StObject.set(x, "toJsonString", value.toJsFn)
      
      inline def setToWebUriString(value: CallbackTo[String]): Self = StObject.set(x, "toWebUriString", value.toJsFn)
    }
  }
  
  object Utils {
    
    @JSImport("digital-link.js", "Utils")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Individual parser rules that can be run with `testRule()`.
      */
    @JSImport("digital-link.js", "Utils.Rules")
    @js.native
    def Rules: RecordRuleNamestring = js.native
    inline def Rules_=(x: RecordRuleNamestring): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Rules")(x.asInstanceOf[js.Any])
    
    /**
      * Use GS1DigitalLinkToolkit to compress a URI string.
      *
      * @param uri - The URI to compress.
      * @param [useOptimisations] - Set to false to disable optimisations.
      * @param [compressOtherKeyValuePairs] - Set to false to disable compression of other
      *                                                 key-value pairs.
      * @returns The equivalent compressed URI.
      */
    inline def compressWebUri(uri: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("compressWebUri")(uri.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def compressWebUri(uri: String, useOptimisations: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("compressWebUri")(uri.asInstanceOf[js.Any], useOptimisations.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def compressWebUri(uri: String, useOptimisations: Boolean, compressOtherKeyValuePairs: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("compressWebUri")(uri.asInstanceOf[js.Any], useOptimisations.asInstanceOf[js.Any], compressOtherKeyValuePairs.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def compressWebUri(uri: String, useOptimisations: Unit, compressOtherKeyValuePairs: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("compressWebUri")(uri.asInstanceOf[js.Any], useOptimisations.asInstanceOf[js.Any], compressOtherKeyValuePairs.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Use GS1DigitalLinkToolkit to decompress a URI string.
      *
      * @param uri - The URI to decompress.
      * @param [useShortText] - Set to true to use short AI names, eg. 'gtin' instead of '01'.
      * @returns The equivalent decompressed URI.
      */
    inline def decompressWebUri(uri: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decompressWebUri")(uri.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Generate the complete HTML fragment provided by apglib for parsing results.
      *
      * @param inputStr - The input URL to generate parser results for.
      * @returns HTML string representing the results of the validation.
      */
    inline def generateResultsHtml(inputStr: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateResultsHtml")(inputStr.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Generate the stats HTML fragment provided by apglib.
      *
      * @param inputStr - The input URL to generate parser stats for.
      * @returns HTML string representing the stats of the validation.
      */
    inline def generateStatsHtml(inputStr: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateStatsHtml")(inputStr.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Generate the trace HTML fragment provided by apglib.
      *
      * @param inputStr - The input URL to generate parser trace for.
      * @returns HTML string representing the trace steps of the validation.
      */
    inline def generateTraceHtml(inputStr: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateTraceHtml")(inputStr.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Returns the index of the identifier code in the segment list passed as a parameter
      * If the url is https://example.com/some/01/other/path/info/01/01234567890128/21/12345?example=true
      * segment will be [some,01,other,path,info,01,01234567890128,21,12345]
      * And it will return 5. (the second '01' is the identifier code)
      *
      * @param segments - The list of the url path element
      * @returns the position of the indentifier in the array (-1 if it there is not any identifier).
      */
    inline def getIdentifierCodeIndex(segments: js.Array[String]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getIdentifierCodeIndex")(segments.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Detect whether a string is a compressed URI or not.
      * The GS1DigitalLinkToolkit returns one of three strings based on if the input looks compressed:
      *   "uncompressed GS1 Digital Link"
      *   "partially compressed GS1 Digital Link"
      *   "fully compressed GS1 Digital Link"
      *
      * Note: this function includes the result's validity, meaning only valid compressed URIs,
      * are supported. Since we cannot compress invalid URIs, this is acceptable.
      *
      * @param uri - The URI.
      * @returns true if the URI is valid and looks compressed, false otherwise.
      */
    inline def isCompressedWebUri(uri: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCompressedWebUri")(uri.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * if the domain has a custom path (ex : https://example.com/path/) it returns the domain without the custom path
      * (ex : https://example.com/)
      * Otherwise, it returns the parameter
      *
      * @param webUriString - The Web URI string (you can get it with dl.toWebUriString())
      * @param domain - The domain of the Digital Link (ex : https://example.com/with/custom/path/ or
      * https://example.com/)
      */
    inline def removeCustomPath(webUriString: String, domain: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("removeCustomPath")(webUriString.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Test a single parser rule for a given value, such as a GTIN.
      * Available rules are found in `Rules` object of this library.
      *
      * @param rule - A rule from the `Rules` object.
      * @param value - The value to validate.
      * @returns true if the value passes against the rule.
      */
    inline def testRule(rule: String, value: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("testRule")(rule.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  trait DigitalLinkInput extends StObject {
    
    var attributes: js.UndefOr[Record[String, String]] = js.undefined
    
    var domain: String
    
    var identifier: Record[String, String]
    
    var keyQualifiers: js.UndefOr[Record[String, String]] = js.undefined
    
    var keyQualifiersOrder: js.UndefOr[js.Array[String]] = js.undefined
    
    var sortKeyQualifiers: js.UndefOr[Boolean] = js.undefined
  }
  object DigitalLinkInput {
    
    inline def apply(domain: String, identifier: Record[String, String]): DigitalLinkInput = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[DigitalLinkInput]
    }
    
    extension [Self <: DigitalLinkInput](x: Self) {
      
      inline def setAttributes(value: Record[String, String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setIdentifier(value: Record[String, String]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      inline def setKeyQualifiers(value: Record[String, String]): Self = StObject.set(x, "keyQualifiers", value.asInstanceOf[js.Any])
      
      inline def setKeyQualifiersOrder(value: js.Array[String]): Self = StObject.set(x, "keyQualifiersOrder", value.asInstanceOf[js.Any])
      
      inline def setKeyQualifiersOrderUndefined: Self = StObject.set(x, "keyQualifiersOrder", js.undefined)
      
      inline def setKeyQualifiersOrderVarargs(value: String*): Self = StObject.set(x, "keyQualifiersOrder", js.Array(value*))
      
      inline def setKeyQualifiersUndefined: Self = StObject.set(x, "keyQualifiers", js.undefined)
      
      inline def setSortKeyQualifiers(value: Boolean): Self = StObject.set(x, "sortKeyQualifiers", value.asInstanceOf[js.Any])
      
      inline def setSortKeyQualifiersUndefined: Self = StObject.set(x, "sortKeyQualifiers", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.gtin
    - typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.itip
    - typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.gmn
    - typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.cpid
    - typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.shipTo
    - typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.billTo
    - typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.purchasedFrom
    - typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.shipFor
    - typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.gln
    - typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.partyGln
    - typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.payTo
    - typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.glnProd
    - typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.gsrnp
    - typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.gsrn
    - typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.gcn
    - typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.sscc
    - typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.gdti
    - typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.ginc
    - typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.gsin
    - typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.grai
    - typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.giai
    - typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.cpv
    - typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.lot
    - typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.ser
    - typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.cpsn
    - typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.glnx
    - typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.refno
    - typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.srin
    - typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.extensionParameter
    - typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.customGS1webURI
    - typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.canonicalGS1webURI
  */
  trait RuleName extends StObject
  object RuleName {
    
    inline def billTo: typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.billTo = "billTo".asInstanceOf[typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.billTo]
    
    inline def canonicalGS1webURI: typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.canonicalGS1webURI = "canonicalGS1webURI".asInstanceOf[typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.canonicalGS1webURI]
    
    inline def cpid: typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.cpid = "cpid".asInstanceOf[typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.cpid]
    
    inline def cpsn: typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.cpsn = "cpsn".asInstanceOf[typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.cpsn]
    
    inline def cpv: typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.cpv = "cpv".asInstanceOf[typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.cpv]
    
    inline def customGS1webURI: typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.customGS1webURI = "customGS1webURI".asInstanceOf[typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.customGS1webURI]
    
    inline def extensionParameter: typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.extensionParameter = "extensionParameter".asInstanceOf[typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.extensionParameter]
    
    inline def gcn: typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.gcn = "gcn".asInstanceOf[typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.gcn]
    
    inline def gdti: typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.gdti = "gdti".asInstanceOf[typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.gdti]
    
    inline def giai: typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.giai = "giai".asInstanceOf[typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.giai]
    
    inline def ginc: typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.ginc = "ginc".asInstanceOf[typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.ginc]
    
    inline def gln: typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.gln = "gln".asInstanceOf[typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.gln]
    
    inline def glnProd: typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.glnProd = "glnProd".asInstanceOf[typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.glnProd]
    
    inline def glnx: typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.glnx = "glnx".asInstanceOf[typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.glnx]
    
    inline def gmn: typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.gmn = "gmn".asInstanceOf[typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.gmn]
    
    inline def grai: typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.grai = "grai".asInstanceOf[typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.grai]
    
    inline def gsin: typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.gsin = "gsin".asInstanceOf[typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.gsin]
    
    inline def gsrn: typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.gsrn = "gsrn".asInstanceOf[typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.gsrn]
    
    inline def gsrnp: typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.gsrnp = "gsrnp".asInstanceOf[typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.gsrnp]
    
    inline def gtin: typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.gtin = "gtin".asInstanceOf[typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.gtin]
    
    inline def itip: typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.itip = "itip".asInstanceOf[typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.itip]
    
    inline def lot: typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.lot = "lot".asInstanceOf[typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.lot]
    
    inline def partyGln: typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.partyGln = "partyGln".asInstanceOf[typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.partyGln]
    
    inline def payTo: typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.payTo = "payTo".asInstanceOf[typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.payTo]
    
    inline def purchasedFrom: typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.purchasedFrom = "purchasedFrom".asInstanceOf[typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.purchasedFrom]
    
    inline def refno: typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.refno = "refno".asInstanceOf[typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.refno]
    
    inline def ser: typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.ser = "ser".asInstanceOf[typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.ser]
    
    inline def shipFor: typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.shipFor = "shipFor".asInstanceOf[typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.shipFor]
    
    inline def shipTo: typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.shipTo = "shipTo".asInstanceOf[typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.shipTo]
    
    inline def srin: typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.srin = "srin".asInstanceOf[typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.srin]
    
    inline def sscc: typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.sscc = "sscc".asInstanceOf[typingsJapgolly.digitalLinkJs.digitalLinkJsStrings.sscc]
  }
  
  trait ValidationTrace extends StObject {
    
    var success: Boolean
    
    var trace: js.Array[Match]
  }
  object ValidationTrace {
    
    inline def apply(success: Boolean, trace: js.Array[Match]): ValidationTrace = {
      val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any], trace = trace.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationTrace]
    }
    
    extension [Self <: ValidationTrace](x: Self) {
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setTrace(value: js.Array[Match]): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
      
      inline def setTraceVarargs(value: Match*): Self = StObject.set(x, "trace", js.Array(value*))
    }
  }
}
