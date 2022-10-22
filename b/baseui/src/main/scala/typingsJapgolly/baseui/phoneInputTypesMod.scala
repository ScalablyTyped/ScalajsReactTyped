package typingsJapgolly.baseui

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.baseui.anon.CountrySelect
import typingsJapgolly.baseui.anon.CountrySelectContainer
import typingsJapgolly.baseui.anon.PartialState
import typingsJapgolly.baseui.helpersOverridesMod.Override
import typingsJapgolly.baseui.selectTypesMod.OnChangeParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object phoneInputTypesMod {
  
  /* Inlined std.Readonly<baseui.baseui/phone-input/types.Country> */
  trait Countries extends StObject {
    
    val dialCode: String
    
    val id: CountryIso
    
    val label: String
  }
  object Countries {
    
    inline def apply(dialCode: String, id: CountryIso, label: String): Countries = {
      val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[Countries]
    }
    
    extension [Self <: Countries](x: Self) {
      
      inline def setDialCode(value: String): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
      
      inline def setId(value: CountryIso): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<{  dialCode :string,   id :baseui.baseui/phone-input/types.CountryIso,   label :string}> */
  trait Country extends StObject {
    
    val dialCode: String
    
    val id: CountryIso
    
    val label: String
  }
  object Country {
    
    inline def apply(dialCode: String, id: CountryIso, label: String): Country = {
      val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[Country]
    }
    
    extension [Self <: Country](x: Self) {
      
      inline def setDialCode(value: String): Self = StObject.set(x, "dialCode", value.asInstanceOf[js.Any])
      
      inline def setId(value: CountryIso): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  /* keyof baseui.anon.AD */ /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.baseui.baseuiStrings.AF
    - typingsJapgolly.baseui.baseuiStrings.AL
    - typingsJapgolly.baseui.baseuiStrings.DZ
    - typingsJapgolly.baseui.baseuiStrings.AS
    - typingsJapgolly.baseui.baseuiStrings.AD
    - typingsJapgolly.baseui.baseuiStrings.AO
    - typingsJapgolly.baseui.baseuiStrings.AI
    - typingsJapgolly.baseui.baseuiStrings.AG
    - typingsJapgolly.baseui.baseuiStrings.AR
    - typingsJapgolly.baseui.baseuiStrings.AM
    - typingsJapgolly.baseui.baseuiStrings.AW
    - typingsJapgolly.baseui.baseuiStrings.AU
    - typingsJapgolly.baseui.baseuiStrings.AT
    - typingsJapgolly.baseui.baseuiStrings.AZ
    - typingsJapgolly.baseui.baseuiStrings.BS
    - typingsJapgolly.baseui.baseuiStrings.BH
    - typingsJapgolly.baseui.baseuiStrings.BD
    - typingsJapgolly.baseui.baseuiStrings.BB
    - typingsJapgolly.baseui.baseuiStrings.BY
    - typingsJapgolly.baseui.baseuiStrings.BE
    - typingsJapgolly.baseui.baseuiStrings.BZ
    - typingsJapgolly.baseui.baseuiStrings.BJ
    - typingsJapgolly.baseui.baseuiStrings.BM
    - typingsJapgolly.baseui.baseuiStrings.BT
    - typingsJapgolly.baseui.baseuiStrings.BO
    - typingsJapgolly.baseui.baseuiStrings.BA
    - typingsJapgolly.baseui.baseuiStrings.BW
    - typingsJapgolly.baseui.baseuiStrings.BR
    - typingsJapgolly.baseui.baseuiStrings.IO
    - typingsJapgolly.baseui.baseuiStrings.VG
    - typingsJapgolly.baseui.baseuiStrings.BN
    - typingsJapgolly.baseui.baseuiStrings.BG
    - typingsJapgolly.baseui.baseuiStrings.BF
    - typingsJapgolly.baseui.baseuiStrings.BI
    - typingsJapgolly.baseui.baseuiStrings.KH
    - typingsJapgolly.baseui.baseuiStrings.CM
    - typingsJapgolly.baseui.baseuiStrings.CA
    - typingsJapgolly.baseui.baseuiStrings.CV
    - typingsJapgolly.baseui.baseuiStrings.KY
    - typingsJapgolly.baseui.baseuiStrings.CF
    - typingsJapgolly.baseui.baseuiStrings.TD
    - typingsJapgolly.baseui.baseuiStrings.CL
    - typingsJapgolly.baseui.baseuiStrings.CN
    - typingsJapgolly.baseui.baseuiStrings.CX
    - typingsJapgolly.baseui.baseuiStrings.CC
    - typingsJapgolly.baseui.baseuiStrings.CO
    - typingsJapgolly.baseui.baseuiStrings.KM
    - typingsJapgolly.baseui.baseuiStrings.CD
    - typingsJapgolly.baseui.baseuiStrings.CG
    - typingsJapgolly.baseui.baseuiStrings.CK
    - typingsJapgolly.baseui.baseuiStrings.CR
    - typingsJapgolly.baseui.baseuiStrings.CI
    - typingsJapgolly.baseui.baseuiStrings.HR
    - typingsJapgolly.baseui.baseuiStrings.CU
    - typingsJapgolly.baseui.baseuiStrings.CW
    - typingsJapgolly.baseui.baseuiStrings.CY
    - typingsJapgolly.baseui.baseuiStrings.CZ
    - typingsJapgolly.baseui.baseuiStrings.DK
    - typingsJapgolly.baseui.baseuiStrings.DJ
    - typingsJapgolly.baseui.baseuiStrings.DM
    - typingsJapgolly.baseui.baseuiStrings.DO
    - typingsJapgolly.baseui.baseuiStrings.EC
    - typingsJapgolly.baseui.baseuiStrings.EG
    - typingsJapgolly.baseui.baseuiStrings.SV
    - typingsJapgolly.baseui.baseuiStrings.GQ
    - typingsJapgolly.baseui.baseuiStrings.ER
    - typingsJapgolly.baseui.baseuiStrings.EE
    - typingsJapgolly.baseui.baseuiStrings.ET
    - typingsJapgolly.baseui.baseuiStrings.FK
    - typingsJapgolly.baseui.baseuiStrings.FO
    - typingsJapgolly.baseui.baseuiStrings.FJ
    - typingsJapgolly.baseui.baseuiStrings.FI
    - typingsJapgolly.baseui.baseuiStrings.FR
    - typingsJapgolly.baseui.baseuiStrings.GF
    - typingsJapgolly.baseui.baseuiStrings.PF
    - typingsJapgolly.baseui.baseuiStrings.GA
    - typingsJapgolly.baseui.baseuiStrings.GM
    - typingsJapgolly.baseui.baseuiStrings.GE
    - typingsJapgolly.baseui.baseuiStrings.DE
    - typingsJapgolly.baseui.baseuiStrings.GH
    - typingsJapgolly.baseui.baseuiStrings.GI
    - typingsJapgolly.baseui.baseuiStrings.GR
    - typingsJapgolly.baseui.baseuiStrings.GL
    - typingsJapgolly.baseui.baseuiStrings.GD
    - typingsJapgolly.baseui.baseuiStrings.GP
    - typingsJapgolly.baseui.baseuiStrings.GU
    - typingsJapgolly.baseui.baseuiStrings.GT
    - typingsJapgolly.baseui.baseuiStrings.GG
    - typingsJapgolly.baseui.baseuiStrings.GN
    - typingsJapgolly.baseui.baseuiStrings.GW
    - typingsJapgolly.baseui.baseuiStrings.GY
    - typingsJapgolly.baseui.baseuiStrings.HT
    - typingsJapgolly.baseui.baseuiStrings.HN
    - typingsJapgolly.baseui.baseuiStrings.HK
    - typingsJapgolly.baseui.baseuiStrings.HU
    - typingsJapgolly.baseui.baseuiStrings.IS
    - typingsJapgolly.baseui.baseuiStrings.IN
    - typingsJapgolly.baseui.baseuiStrings.ID
    - typingsJapgolly.baseui.baseuiStrings.IR
    - typingsJapgolly.baseui.baseuiStrings.IQ
    - typingsJapgolly.baseui.baseuiStrings.IE
    - typingsJapgolly.baseui.baseuiStrings.IM
    - typingsJapgolly.baseui.baseuiStrings.IL
    - typingsJapgolly.baseui.baseuiStrings.IT
    - typingsJapgolly.baseui.baseuiStrings.JM
    - typingsJapgolly.baseui.baseuiStrings.JP
    - typingsJapgolly.baseui.baseuiStrings.JE
    - typingsJapgolly.baseui.baseuiStrings.JO
    - typingsJapgolly.baseui.baseuiStrings.KZ
    - typingsJapgolly.baseui.baseuiStrings.KE
    - typingsJapgolly.baseui.baseuiStrings.KI
    - typingsJapgolly.baseui.baseuiStrings.XK
    - typingsJapgolly.baseui.baseuiStrings.KW
    - typingsJapgolly.baseui.baseuiStrings.KG
    - typingsJapgolly.baseui.baseuiStrings.LA
    - typingsJapgolly.baseui.baseuiStrings.LV
    - typingsJapgolly.baseui.baseuiStrings.LB
    - typingsJapgolly.baseui.baseuiStrings.LS
    - typingsJapgolly.baseui.baseuiStrings.LR
    - typingsJapgolly.baseui.baseuiStrings.LY
    - typingsJapgolly.baseui.baseuiStrings.LI
    - typingsJapgolly.baseui.baseuiStrings.LT
    - typingsJapgolly.baseui.baseuiStrings.LU
    - typingsJapgolly.baseui.baseuiStrings.MO
    - typingsJapgolly.baseui.baseuiStrings.MK
    - typingsJapgolly.baseui.baseuiStrings.MG
    - typingsJapgolly.baseui.baseuiStrings.MW
    - typingsJapgolly.baseui.baseuiStrings.MY
    - typingsJapgolly.baseui.baseuiStrings.MV
    - typingsJapgolly.baseui.baseuiStrings.ML
    - typingsJapgolly.baseui.baseuiStrings.MT
    - typingsJapgolly.baseui.baseuiStrings.MH
    - typingsJapgolly.baseui.baseuiStrings.MQ
    - typingsJapgolly.baseui.baseuiStrings.MR
    - typingsJapgolly.baseui.baseuiStrings.MU
    - typingsJapgolly.baseui.baseuiStrings.YT
    - typingsJapgolly.baseui.baseuiStrings.MX
    - typingsJapgolly.baseui.baseuiStrings.FM
    - typingsJapgolly.baseui.baseuiStrings.MD
    - typingsJapgolly.baseui.baseuiStrings.MC
    - typingsJapgolly.baseui.baseuiStrings.MN
    - typingsJapgolly.baseui.baseuiStrings.ME
    - typingsJapgolly.baseui.baseuiStrings.MS
    - typingsJapgolly.baseui.baseuiStrings.MA
    - typingsJapgolly.baseui.baseuiStrings.MZ
    - typingsJapgolly.baseui.baseuiStrings.MM
    - typingsJapgolly.baseui.baseuiStrings.NA
    - typingsJapgolly.baseui.baseuiStrings.NR
    - typingsJapgolly.baseui.baseuiStrings.NP
    - typingsJapgolly.baseui.baseuiStrings.NL
    - typingsJapgolly.baseui.baseuiStrings.NC
    - typingsJapgolly.baseui.baseuiStrings.NZ
    - typingsJapgolly.baseui.baseuiStrings.NI
    - typingsJapgolly.baseui.baseuiStrings.NE
    - typingsJapgolly.baseui.baseuiStrings.NG
    - typingsJapgolly.baseui.baseuiStrings.NU
    - typingsJapgolly.baseui.baseuiStrings.NF
    - typingsJapgolly.baseui.baseuiStrings.KP
    - typingsJapgolly.baseui.baseuiStrings.MP
    - typingsJapgolly.baseui.baseuiStrings.NO
    - typingsJapgolly.baseui.baseuiStrings.OM
    - typingsJapgolly.baseui.baseuiStrings.PK
    - typingsJapgolly.baseui.baseuiStrings.PW
    - typingsJapgolly.baseui.baseuiStrings.PS
    - typingsJapgolly.baseui.baseuiStrings.PA
    - typingsJapgolly.baseui.baseuiStrings.PG
    - typingsJapgolly.baseui.baseuiStrings.PY
    - typingsJapgolly.baseui.baseuiStrings.PE
    - typingsJapgolly.baseui.baseuiStrings.PH
    - typingsJapgolly.baseui.baseuiStrings.PL
    - typingsJapgolly.baseui.baseuiStrings.PT
    - typingsJapgolly.baseui.baseuiStrings.PR
    - typingsJapgolly.baseui.baseuiStrings.QA
    - typingsJapgolly.baseui.baseuiStrings.RE
    - typingsJapgolly.baseui.baseuiStrings.RO
    - typingsJapgolly.baseui.baseuiStrings.RU
    - typingsJapgolly.baseui.baseuiStrings.RW
    - typingsJapgolly.baseui.baseuiStrings.BL
    - typingsJapgolly.baseui.baseuiStrings.SH
    - typingsJapgolly.baseui.baseuiStrings.KN
    - typingsJapgolly.baseui.baseuiStrings.LC
    - typingsJapgolly.baseui.baseuiStrings.MF
    - typingsJapgolly.baseui.baseuiStrings.PM
    - typingsJapgolly.baseui.baseuiStrings.VC
    - typingsJapgolly.baseui.baseuiStrings.WS
    - typingsJapgolly.baseui.baseuiStrings.SM
    - typingsJapgolly.baseui.baseuiStrings.ST
    - typingsJapgolly.baseui.baseuiStrings.SA
    - typingsJapgolly.baseui.baseuiStrings.SN
    - typingsJapgolly.baseui.baseuiStrings.RS
    - typingsJapgolly.baseui.baseuiStrings.SC
    - typingsJapgolly.baseui.baseuiStrings.SL
    - typingsJapgolly.baseui.baseuiStrings.SG
    - typingsJapgolly.baseui.baseuiStrings.SX
    - typingsJapgolly.baseui.baseuiStrings.SK
    - typingsJapgolly.baseui.baseuiStrings.SI
    - typingsJapgolly.baseui.baseuiStrings.SB
    - typingsJapgolly.baseui.baseuiStrings.SO
    - typingsJapgolly.baseui.baseuiStrings.ZA
    - typingsJapgolly.baseui.baseuiStrings.KR
    - typingsJapgolly.baseui.baseuiStrings.SS
    - typingsJapgolly.baseui.baseuiStrings.ES
    - typingsJapgolly.baseui.baseuiStrings.LK
    - typingsJapgolly.baseui.baseuiStrings.SD
    - typingsJapgolly.baseui.baseuiStrings.SR
    - typingsJapgolly.baseui.baseuiStrings.SJ
    - typingsJapgolly.baseui.baseuiStrings.SZ
    - typingsJapgolly.baseui.baseuiStrings.SE
    - typingsJapgolly.baseui.baseuiStrings.CH
    - typingsJapgolly.baseui.baseuiStrings.SY
    - typingsJapgolly.baseui.baseuiStrings.TW
    - typingsJapgolly.baseui.baseuiStrings.TJ
    - typingsJapgolly.baseui.baseuiStrings.TZ
    - typingsJapgolly.baseui.baseuiStrings.TH
    - typingsJapgolly.baseui.baseuiStrings.TL
    - typingsJapgolly.baseui.baseuiStrings.TG
    - typingsJapgolly.baseui.baseuiStrings.TK
    - typingsJapgolly.baseui.baseuiStrings.TO
    - typingsJapgolly.baseui.baseuiStrings.TT
    - typingsJapgolly.baseui.baseuiStrings.TN
    - typingsJapgolly.baseui.baseuiStrings.TR
    - typingsJapgolly.baseui.baseuiStrings.TM
    - typingsJapgolly.baseui.baseuiStrings.TC
    - typingsJapgolly.baseui.baseuiStrings.TV
    - typingsJapgolly.baseui.baseuiStrings.VI
    - typingsJapgolly.baseui.baseuiStrings.UG
    - typingsJapgolly.baseui.baseuiStrings.UA
    - typingsJapgolly.baseui.baseuiStrings.AE
    - typingsJapgolly.baseui.baseuiStrings.GB
    - typingsJapgolly.baseui.baseuiStrings.US
    - typingsJapgolly.baseui.baseuiStrings.UY
    - typingsJapgolly.baseui.baseuiStrings.UZ
    - typingsJapgolly.baseui.baseuiStrings.VU
    - typingsJapgolly.baseui.baseuiStrings.VA
    - typingsJapgolly.baseui.baseuiStrings.VE
    - typingsJapgolly.baseui.baseuiStrings.VN
    - typingsJapgolly.baseui.baseuiStrings.WF
    - typingsJapgolly.baseui.baseuiStrings.YE
    - typingsJapgolly.baseui.baseuiStrings.ZM
    - typingsJapgolly.baseui.baseuiStrings.ZW
    - typingsJapgolly.baseui.baseuiStrings.AX
  */
  trait CountryIso extends StObject
  
  trait CountrySelectDropdownProps extends StObject {
    
    @JSName("$country")
    var $country: Country
    
    @JSName("$mapIsoToLabel")
    var $mapIsoToLabel: js.UndefOr[mapIsoToLabel] = js.undefined
    
    @JSName("$maxDropdownHeight")
    var $maxDropdownHeight: String
    
    @JSName("$noResultsMsg")
    var $noResultsMsg: String
    
    @JSName("$overrides")
    var $overrides: CountrySelectContainer
    
    var children: js.Array[Element]
  }
  object CountrySelectDropdownProps {
    
    inline def apply(
      $country: Country,
      $maxDropdownHeight: String,
      $noResultsMsg: String,
      $overrides: CountrySelectContainer,
      children: js.Array[Element]
    ): CountrySelectDropdownProps = {
      val __obj = js.Dynamic.literal($country = $country.asInstanceOf[js.Any], $maxDropdownHeight = $maxDropdownHeight.asInstanceOf[js.Any], $noResultsMsg = $noResultsMsg.asInstanceOf[js.Any], $overrides = $overrides.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[CountrySelectDropdownProps]
    }
    
    extension [Self <: CountrySelectDropdownProps](x: Self) {
      
      inline def set$country(value: Country): Self = StObject.set(x, "$country", value.asInstanceOf[js.Any])
      
      inline def set$mapIsoToLabel(value: /* iso */ String => String): Self = StObject.set(x, "$mapIsoToLabel", js.Any.fromFunction1(value))
      
      inline def set$mapIsoToLabelUndefined: Self = StObject.set(x, "$mapIsoToLabel", js.undefined)
      
      inline def set$maxDropdownHeight(value: String): Self = StObject.set(x, "$maxDropdownHeight", value.asInstanceOf[js.Any])
      
      inline def set$noResultsMsg(value: String): Self = StObject.set(x, "$noResultsMsg", value.asInstanceOf[js.Any])
      
      inline def set$overrides(value: CountrySelectContainer): Self = StObject.set(x, "$overrides", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: js.Array[Element]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value*))
    }
  }
  
  trait CountrySelectProps extends StObject {
    
    var countries: StringDictionary[Country]
    
    var country: Country
    
    var disabled: Boolean
    
    var error: Boolean
    
    var inputRef: RefHandle[HTMLInputElement]
    
    var mapIsoToLabel: js.UndefOr[typingsJapgolly.baseui.phoneInputTypesMod.mapIsoToLabel] = js.undefined
    
    var maxDropdownHeight: String
    
    var maxDropdownWidth: String
    
    def onCountryChange(event: OnChangeParams): Any
    
    var overrides: CountrySelect
    
    var positive: Boolean
    
    var required: Boolean
    
    var size: Size
  }
  object CountrySelectProps {
    
    inline def apply(
      countries: StringDictionary[Country],
      country: Country,
      disabled: Boolean,
      error: Boolean,
      inputRef: RefHandle[HTMLInputElement],
      maxDropdownHeight: String,
      maxDropdownWidth: String,
      onCountryChange: OnChangeParams => Any,
      overrides: CountrySelect,
      positive: Boolean,
      required: Boolean,
      size: Size
    ): CountrySelectProps = {
      val __obj = js.Dynamic.literal(countries = countries.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], inputRef = inputRef.asInstanceOf[js.Any], maxDropdownHeight = maxDropdownHeight.asInstanceOf[js.Any], maxDropdownWidth = maxDropdownWidth.asInstanceOf[js.Any], onCountryChange = js.Any.fromFunction1(onCountryChange), overrides = overrides.asInstanceOf[js.Any], positive = positive.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[CountrySelectProps]
    }
    
    extension [Self <: CountrySelectProps](x: Self) {
      
      inline def setCountries(value: StringDictionary[Country]): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
      
      inline def setCountry(value: Country): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setInputRef(value: RefHandle[HTMLInputElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      inline def setMapIsoToLabel(value: /* iso */ String => String): Self = StObject.set(x, "mapIsoToLabel", js.Any.fromFunction1(value))
      
      inline def setMapIsoToLabelUndefined: Self = StObject.set(x, "mapIsoToLabel", js.undefined)
      
      inline def setMaxDropdownHeight(value: String): Self = StObject.set(x, "maxDropdownHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxDropdownWidth(value: String): Self = StObject.set(x, "maxDropdownWidth", value.asInstanceOf[js.Any])
      
      inline def setOnCountryChange(value: OnChangeParams => Any): Self = StObject.set(x, "onCountryChange", js.Any.fromFunction1(value))
      
      inline def setOverrides(value: CountrySelect): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setPositive(value: Boolean): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait PhoneInputLiteProps
    extends StObject
       with PhoneInputProps {
    
    var countries: StringDictionary[Country]
  }
  object PhoneInputLiteProps {
    
    inline def apply(
      countries: StringDictionary[Country],
      country: Country,
      disabled: Boolean,
      error: Boolean,
      maxDropdownHeight: String,
      maxDropdownWidth: String,
      onCountryChange: OnChangeParams => Any,
      onTextChange: ReactEventFrom[HTMLInputElement] => Any,
      overrides: PhoneInputOverrides,
      positive: Boolean,
      required: Boolean,
      size: Size,
      text: String
    ): PhoneInputLiteProps = {
      val __obj = js.Dynamic.literal(countries = countries.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], maxDropdownHeight = maxDropdownHeight.asInstanceOf[js.Any], maxDropdownWidth = maxDropdownWidth.asInstanceOf[js.Any], onCountryChange = js.Any.fromFunction1(onCountryChange), onTextChange = js.Any.fromFunction1(onTextChange), overrides = overrides.asInstanceOf[js.Any], positive = positive.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhoneInputLiteProps]
    }
    
    extension [Self <: PhoneInputLiteProps](x: Self) {
      
      inline def setCountries(value: StringDictionary[Country]): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
    }
  }
  
  trait PhoneInputOverrides extends StObject {
    
    var CountrySelect: js.UndefOr[Override[Any]] = js.undefined
    
    var CountrySelectContainer: js.UndefOr[Override[Any]] = js.undefined
    
    var CountrySelectDropdown: js.UndefOr[Override[Any]] = js.undefined
    
    var CountrySelectDropdownDialcodeColumn: js.UndefOr[Override[Any]] = js.undefined
    
    var CountrySelectDropdownFlagColumn: js.UndefOr[Override[Any]] = js.undefined
    
    var CountrySelectDropdownListItem: js.UndefOr[Override[Any]] = js.undefined
    
    var CountrySelectDropdownNameColumn: js.UndefOr[Override[Any]] = js.undefined
    
    var DialCode: js.UndefOr[Override[Any]] = js.undefined
    
    var FlagContainer: js.UndefOr[Override[Any]] = js.undefined
    
    var Input: js.UndefOr[Override[Any]] = js.undefined
    
    var Root: js.UndefOr[Override[Any]] = js.undefined
  }
  object PhoneInputOverrides {
    
    inline def apply(): PhoneInputOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PhoneInputOverrides]
    }
    
    extension [Self <: PhoneInputOverrides](x: Self) {
      
      inline def setCountrySelect(value: Override[Any]): Self = StObject.set(x, "CountrySelect", value.asInstanceOf[js.Any])
      
      inline def setCountrySelectContainer(value: Override[Any]): Self = StObject.set(x, "CountrySelectContainer", value.asInstanceOf[js.Any])
      
      inline def setCountrySelectContainerUndefined: Self = StObject.set(x, "CountrySelectContainer", js.undefined)
      
      inline def setCountrySelectDropdown(value: Override[Any]): Self = StObject.set(x, "CountrySelectDropdown", value.asInstanceOf[js.Any])
      
      inline def setCountrySelectDropdownDialcodeColumn(value: Override[Any]): Self = StObject.set(x, "CountrySelectDropdownDialcodeColumn", value.asInstanceOf[js.Any])
      
      inline def setCountrySelectDropdownDialcodeColumnUndefined: Self = StObject.set(x, "CountrySelectDropdownDialcodeColumn", js.undefined)
      
      inline def setCountrySelectDropdownFlagColumn(value: Override[Any]): Self = StObject.set(x, "CountrySelectDropdownFlagColumn", value.asInstanceOf[js.Any])
      
      inline def setCountrySelectDropdownFlagColumnUndefined: Self = StObject.set(x, "CountrySelectDropdownFlagColumn", js.undefined)
      
      inline def setCountrySelectDropdownListItem(value: Override[Any]): Self = StObject.set(x, "CountrySelectDropdownListItem", value.asInstanceOf[js.Any])
      
      inline def setCountrySelectDropdownListItemUndefined: Self = StObject.set(x, "CountrySelectDropdownListItem", js.undefined)
      
      inline def setCountrySelectDropdownNameColumn(value: Override[Any]): Self = StObject.set(x, "CountrySelectDropdownNameColumn", value.asInstanceOf[js.Any])
      
      inline def setCountrySelectDropdownNameColumnUndefined: Self = StObject.set(x, "CountrySelectDropdownNameColumn", js.undefined)
      
      inline def setCountrySelectDropdownUndefined: Self = StObject.set(x, "CountrySelectDropdown", js.undefined)
      
      inline def setCountrySelectUndefined: Self = StObject.set(x, "CountrySelect", js.undefined)
      
      inline def setDialCode(value: Override[Any]): Self = StObject.set(x, "DialCode", value.asInstanceOf[js.Any])
      
      inline def setDialCodeUndefined: Self = StObject.set(x, "DialCode", js.undefined)
      
      inline def setFlagContainer(value: Override[Any]): Self = StObject.set(x, "FlagContainer", value.asInstanceOf[js.Any])
      
      inline def setFlagContainerUndefined: Self = StObject.set(x, "FlagContainer", js.undefined)
      
      inline def setInput(value: Override[Any]): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
      
      inline def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
      
      inline def setRoot(value: Override[Any]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
    }
  }
  
  trait PhoneInputProps extends StObject {
    
    /** Sets aria-describedby attribute of the input element. */
    var `aria-describedby`: js.UndefOr[String | Null] = js.undefined
    
    /** Sets aria-label attribute of the input element. */
    var `aria-label`: js.UndefOr[String | Null] = js.undefined
    
    /** Sets aria-labelledby attribute of the input element. */
    var `aria-labelledby`: js.UndefOr[String | Null] = js.undefined
    
    /** Defines if the input value is clearable. */
    var clearable: js.UndefOr[Boolean] = js.undefined
    
    /** Defines the value of the country select. */
    var country: Country
    
    /** Defines if the component is disabled. */
    var disabled: Boolean
    
    /** Renders component in 'error' state. */
    var error: Boolean
    
    /** Sets the id attribute of the input element. */
    var id: js.UndefOr[String | Null] = js.undefined
    
    /** Function for mapping ISO codes to country names. Useful for localization of the country select dropdown. */
    var mapIsoToLabel: js.UndefOr[typingsJapgolly.baseui.phoneInputTypesMod.mapIsoToLabel] = js.undefined
    
    /** Sets the max height of the country select dropdown. */
    var maxDropdownHeight: String
    
    /** Sets the max width of the country select dropdown. */
    var maxDropdownWidth: String
    
    /** Sets the name attribute of the input element. */
    var name: js.UndefOr[String | Null] = js.undefined
    
    /** A handler for the country select's change events. */
    def onCountryChange(event: OnChangeParams): Any
    
    /** A handler for the input element's change events. */
    def onTextChange(event: ReactEventFrom[HTMLInputElement]): Any
    
    var overrides: PhoneInputOverrides
    
    /** Sets the placeholder text for the input element.  */
    var placeholder: js.UndefOr[String] = js.undefined
    
    /** Renders component in 'positive' state. */
    var positive: Boolean
    
    /** Sets the 'required' attribute of the input element. The country select will always have a value so does has no need for 'require'. */
    var required: Boolean
    
    /** Sets the size of the component. */
    var size: Size
    
    /** Defines the value of the input element. */
    var text: String
  }
  object PhoneInputProps {
    
    inline def apply(
      country: Country,
      disabled: Boolean,
      error: Boolean,
      maxDropdownHeight: String,
      maxDropdownWidth: String,
      onCountryChange: OnChangeParams => Any,
      onTextChange: ReactEventFrom[HTMLInputElement] => Any,
      overrides: PhoneInputOverrides,
      positive: Boolean,
      required: Boolean,
      size: Size,
      text: String
    ): PhoneInputProps = {
      val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], maxDropdownHeight = maxDropdownHeight.asInstanceOf[js.Any], maxDropdownWidth = maxDropdownWidth.asInstanceOf[js.Any], onCountryChange = js.Any.fromFunction1(onCountryChange), onTextChange = js.Any.fromFunction1(onTextChange), overrides = overrides.asInstanceOf[js.Any], positive = positive.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhoneInputProps]
    }
    
    extension [Self <: PhoneInputProps](x: Self) {
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyNull`: Self = StObject.set(x, "aria-describedby", null)
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelNull`: Self = StObject.set(x, "aria-label", null)
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyNull`: Self = StObject.set(x, "aria-labelledby", null)
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def setClearable(value: Boolean): Self = StObject.set(x, "clearable", value.asInstanceOf[js.Any])
      
      inline def setClearableUndefined: Self = StObject.set(x, "clearable", js.undefined)
      
      inline def setCountry(value: Country): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdNull: Self = StObject.set(x, "id", null)
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMapIsoToLabel(value: /* iso */ String => String): Self = StObject.set(x, "mapIsoToLabel", js.Any.fromFunction1(value))
      
      inline def setMapIsoToLabelUndefined: Self = StObject.set(x, "mapIsoToLabel", js.undefined)
      
      inline def setMaxDropdownHeight(value: String): Self = StObject.set(x, "maxDropdownHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxDropdownWidth(value: String): Self = StObject.set(x, "maxDropdownWidth", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnCountryChange(value: OnChangeParams => Any): Self = StObject.set(x, "onCountryChange", js.Any.fromFunction1(value))
      
      inline def setOnTextChange(value: ReactEventFrom[HTMLInputElement] => Any): Self = StObject.set(x, "onTextChange", js.Any.fromFunction1(value))
      
      inline def setOverrides(value: PhoneInputOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPositive(value: Boolean): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  /* keyof baseui.anon.Compact */ /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.baseui.baseuiStrings.mini
    - typingsJapgolly.baseui.baseuiStrings.default_
    - typingsJapgolly.baseui.baseuiStrings.compact
    - typingsJapgolly.baseui.baseuiStrings.large_
  */
  trait Size extends StObject
  
  trait State extends StObject {
    
    var country: Country
    
    var text: String
  }
  object State {
    
    inline def apply(country: Country, text: String): State = {
      val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setCountry(value: Country): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  /* keyof baseui.anon.CountryChange */ /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.baseui.baseuiStrings.textChange
    - typingsJapgolly.baseui.baseuiStrings.countryChange
  */
  trait StateChange extends StObject
  
  type StateReducer = js.Function3[/* type */ StateChange, /* nextState */ PartialState, /* currentState */ State, State]
  
  trait StatefulPhoneInputContainerProps
    extends StObject
       with PhoneInputProps {
    
    def children(a: PhoneInputProps): Node
    
    var initialState: State
    
    var stateReducer: StateReducer
  }
  object StatefulPhoneInputContainerProps {
    
    inline def apply(
      children: PhoneInputProps => Node,
      country: Country,
      disabled: Boolean,
      error: Boolean,
      initialState: State,
      maxDropdownHeight: String,
      maxDropdownWidth: String,
      onCountryChange: OnChangeParams => Any,
      onTextChange: ReactEventFrom[HTMLInputElement] => Any,
      overrides: PhoneInputOverrides,
      positive: Boolean,
      required: Boolean,
      size: Size,
      stateReducer: (/* type */ StateChange, /* nextState */ PartialState, /* currentState */ State) => State,
      text: String
    ): StatefulPhoneInputContainerProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), country = country.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], initialState = initialState.asInstanceOf[js.Any], maxDropdownHeight = maxDropdownHeight.asInstanceOf[js.Any], maxDropdownWidth = maxDropdownWidth.asInstanceOf[js.Any], onCountryChange = js.Any.fromFunction1(onCountryChange), onTextChange = js.Any.fromFunction1(onTextChange), overrides = overrides.asInstanceOf[js.Any], positive = positive.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], stateReducer = js.Any.fromFunction3(stateReducer), text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatefulPhoneInputContainerProps]
    }
    
    extension [Self <: StatefulPhoneInputContainerProps](x: Self) {
      
      inline def setChildren(value: PhoneInputProps => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setStateReducer(value: (/* type */ StateChange, /* nextState */ PartialState, /* currentState */ State) => State): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
    }
  }
  
  trait StatefulPhoneInputProps
    extends StObject
       with PhoneInputProps {
    
    var initialState: js.UndefOr[State] = js.undefined
    
    var onCountryChange: js.UndefOr[js.Function1[/* event */ OnChangeParams, Any]] = js.undefined
    
    var onTextChange: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLInputElement], Any]] = js.undefined
    
    var stateReducer: js.UndefOr[StateReducer] = js.undefined
  }
  object StatefulPhoneInputProps {
    
    inline def apply(
      country: Country,
      disabled: Boolean,
      error: Boolean,
      maxDropdownHeight: String,
      maxDropdownWidth: String,
      overrides: PhoneInputOverrides,
      positive: Boolean,
      required: Boolean,
      size: Size,
      text: String
    ): StatefulPhoneInputProps = {
      val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], maxDropdownHeight = maxDropdownHeight.asInstanceOf[js.Any], maxDropdownWidth = maxDropdownWidth.asInstanceOf[js.Any], overrides = overrides.asInstanceOf[js.Any], positive = positive.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatefulPhoneInputProps]
    }
    
    extension [Self <: StatefulPhoneInputProps](x: Self) {
      
      inline def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setOnCountryChange(value: /* event */ OnChangeParams => Any): Self = StObject.set(x, "onCountryChange", js.Any.fromFunction1(value))
      
      inline def setOnCountryChangeUndefined: Self = StObject.set(x, "onCountryChange", js.undefined)
      
      inline def setOnTextChange(value: /* event */ ReactEventFrom[HTMLInputElement] => Any): Self = StObject.set(x, "onTextChange", js.Any.fromFunction1(value))
      
      inline def setOnTextChangeUndefined: Self = StObject.set(x, "onTextChange", js.undefined)
      
      inline def setStateReducer(value: (/* type */ StateChange, /* nextState */ PartialState, /* currentState */ State) => State): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
      
      inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    }
  }
  
  type mapIsoToLabel = js.Function1[/* iso */ String, String]
}
