package typingsJapgolly.chromeApps.chrome

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.i18n
/////////////////////////////////
// i18n - Internationalization //
/////////////////////////////////
/**
  * Use the chrome.i18n infrastructure to implement internationalization across your whole app.
  * Content scripts: Fully supported.
  * @see[Docs]{@link https://developer.chrome.com/apps/i18n}
  * @since Chrome 25.
  */
object i18n {
  
  /** Holds detected ISO language code and its percentage in the input string */
  trait DetectedLanguage extends StObject {
    
    /**
      * An ISO language code such as 'en' or 'fr'.
      * For a complete list of languages supported by this method:
      * @see [kLanguageInfoTable]{@link https://src.chromium.org/viewvc/chrome/trunk/src/third_party/cld/languages/internal/languages.cc}.
      * For an unknown language, 'und' will be returned, which means that [percentage] of the text is unknown to CLD */
    var language: kLanguageInfoTable
    
    /** The percentage of the detected language */
    var percentage: integer
  }
  object DetectedLanguage {
    
    inline def apply(language: kLanguageInfoTable, percentage: integer): DetectedLanguage = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], percentage = percentage.asInstanceOf[js.Any])
      __obj.asInstanceOf[DetectedLanguage]
    }
    
    extension [Self <: DetectedLanguage](x: Self) {
      
      inline def setLanguage(value: kLanguageInfoTable): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setPercentage(value: integer): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * An ISO language code such as en or fr.
    * For a complete list of languages supported by this method, see kLanguageInfoTable.
    * For an unknown language, und will be returned,
    * which means that [percentage] of the text is unknown to CLD
    * @since Chrome 47.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.chromeApps.chromeAppsStrings.und
    - typingsJapgolly.chromeApps.chromeAppsStrings.af
    - typingsJapgolly.chromeApps.chromeAppsStrings.am
    - typingsJapgolly.chromeApps.chromeAppsStrings.an
    - typingsJapgolly.chromeApps.chromeAppsStrings.ar
    - typingsJapgolly.chromeApps.chromeAppsStrings.ast
    - typingsJapgolly.chromeApps.chromeAppsStrings.az
    - typingsJapgolly.chromeApps.chromeAppsStrings.be
    - typingsJapgolly.chromeApps.chromeAppsStrings.bg
    - typingsJapgolly.chromeApps.chromeAppsStrings.bh
    - typingsJapgolly.chromeApps.chromeAppsStrings.bn
    - typingsJapgolly.chromeApps.chromeAppsStrings.br
    - typingsJapgolly.chromeApps.chromeAppsStrings.bs
    - typingsJapgolly.chromeApps.chromeAppsStrings.ca
    - typingsJapgolly.chromeApps.chromeAppsStrings.ceb
    - typingsJapgolly.chromeApps.chromeAppsStrings.ckb
    - typingsJapgolly.chromeApps.chromeAppsStrings.co
    - typingsJapgolly.chromeApps.chromeAppsStrings.cs
    - typingsJapgolly.chromeApps.chromeAppsStrings.cy
    - typingsJapgolly.chromeApps.chromeAppsStrings.da
    - typingsJapgolly.chromeApps.chromeAppsStrings.de
    - typingsJapgolly.chromeApps.chromeAppsStrings.`de-AT`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`de-CH`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`de-DE`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`de-LI`
    - typingsJapgolly.chromeApps.chromeAppsStrings.el
    - typingsJapgolly.chromeApps.chromeAppsStrings.en
    - typingsJapgolly.chromeApps.chromeAppsStrings.`en-AU`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`en-CA`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`en-GB`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`en-IN`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`en-NZ`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`en-US`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`en-ZA`
    - typingsJapgolly.chromeApps.chromeAppsStrings.eo
    - typingsJapgolly.chromeApps.chromeAppsStrings.es
    - typingsJapgolly.chromeApps.chromeAppsStrings.`es-419`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`es-AR`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`es-CL`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`es-CO`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`es-CR`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`es-ES`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`es-HN`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`es-MX`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`es-PE`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`es-US`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`es-UY`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`es-VE`
    - typingsJapgolly.chromeApps.chromeAppsStrings.et
    - typingsJapgolly.chromeApps.chromeAppsStrings.eu
    - typingsJapgolly.chromeApps.chromeAppsStrings.fa
    - typingsJapgolly.chromeApps.chromeAppsStrings.fi
    - typingsJapgolly.chromeApps.chromeAppsStrings.fil
    - typingsJapgolly.chromeApps.chromeAppsStrings.fo
    - typingsJapgolly.chromeApps.chromeAppsStrings.fr
    - typingsJapgolly.chromeApps.chromeAppsStrings.`fr-CA`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`fr-CH`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`fr-FR`
    - typingsJapgolly.chromeApps.chromeAppsStrings.fy
    - typingsJapgolly.chromeApps.chromeAppsStrings.ga
    - typingsJapgolly.chromeApps.chromeAppsStrings.gd
    - typingsJapgolly.chromeApps.chromeAppsStrings.gl
    - typingsJapgolly.chromeApps.chromeAppsStrings.gn
    - typingsJapgolly.chromeApps.chromeAppsStrings.gu
    - typingsJapgolly.chromeApps.chromeAppsStrings.ha
    - typingsJapgolly.chromeApps.chromeAppsStrings.haw
    - typingsJapgolly.chromeApps.chromeAppsStrings.he
    - typingsJapgolly.chromeApps.chromeAppsStrings.hi
    - typingsJapgolly.chromeApps.chromeAppsStrings.hmn
    - typingsJapgolly.chromeApps.chromeAppsStrings.hr
    - typingsJapgolly.chromeApps.chromeAppsStrings.ht
    - typingsJapgolly.chromeApps.chromeAppsStrings.hu
    - typingsJapgolly.chromeApps.chromeAppsStrings.hy
    - typingsJapgolly.chromeApps.chromeAppsStrings.ia
    - typingsJapgolly.chromeApps.chromeAppsStrings.id
    - typingsJapgolly.chromeApps.chromeAppsStrings.ig
    - typingsJapgolly.chromeApps.chromeAppsStrings.is
    - typingsJapgolly.chromeApps.chromeAppsStrings.it
    - typingsJapgolly.chromeApps.chromeAppsStrings.`it-CH`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`it-IT`
    - typingsJapgolly.chromeApps.chromeAppsStrings.ja
    - typingsJapgolly.chromeApps.chromeAppsStrings.jv
    - typingsJapgolly.chromeApps.chromeAppsStrings.ka
    - typingsJapgolly.chromeApps.chromeAppsStrings.kk
    - typingsJapgolly.chromeApps.chromeAppsStrings.km
    - typingsJapgolly.chromeApps.chromeAppsStrings.kn
    - typingsJapgolly.chromeApps.chromeAppsStrings.ko
    - typingsJapgolly.chromeApps.chromeAppsStrings.ku
    - typingsJapgolly.chromeApps.chromeAppsStrings.ky
    - typingsJapgolly.chromeApps.chromeAppsStrings.la
    - typingsJapgolly.chromeApps.chromeAppsStrings.lb
    - typingsJapgolly.chromeApps.chromeAppsStrings.ln
    - typingsJapgolly.chromeApps.chromeAppsStrings.lo
    - typingsJapgolly.chromeApps.chromeAppsStrings.lt
    - typingsJapgolly.chromeApps.chromeAppsStrings.lv
    - typingsJapgolly.chromeApps.chromeAppsStrings.mg
    - typingsJapgolly.chromeApps.chromeAppsStrings.mi
    - typingsJapgolly.chromeApps.chromeAppsStrings.mk
    - typingsJapgolly.chromeApps.chromeAppsStrings.ml
    - typingsJapgolly.chromeApps.chromeAppsStrings.mn
    - typingsJapgolly.chromeApps.chromeAppsStrings.mo
    - typingsJapgolly.chromeApps.chromeAppsStrings.mr
    - typingsJapgolly.chromeApps.chromeAppsStrings.ms
    - typingsJapgolly.chromeApps.chromeAppsStrings.mt
    - typingsJapgolly.chromeApps.chromeAppsStrings.my
    - typingsJapgolly.chromeApps.chromeAppsStrings.nb
    - typingsJapgolly.chromeApps.chromeAppsStrings.ne
    - typingsJapgolly.chromeApps.chromeAppsStrings.nl
    - typingsJapgolly.chromeApps.chromeAppsStrings.nn
    - typingsJapgolly.chromeApps.chromeAppsStrings.no
    - typingsJapgolly.chromeApps.chromeAppsStrings.ny
    - typingsJapgolly.chromeApps.chromeAppsStrings.oc
    - typingsJapgolly.chromeApps.chromeAppsStrings.om
    - typingsJapgolly.chromeApps.chromeAppsStrings.or
    - typingsJapgolly.chromeApps.chromeAppsStrings.pa
    - typingsJapgolly.chromeApps.chromeAppsStrings.pl
    - typingsJapgolly.chromeApps.chromeAppsStrings.ps
    - typingsJapgolly.chromeApps.chromeAppsStrings.pt
    - typingsJapgolly.chromeApps.chromeAppsStrings.`pt-BR`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`pt-PT`
    - typingsJapgolly.chromeApps.chromeAppsStrings.qu
    - typingsJapgolly.chromeApps.chromeAppsStrings.rm
    - typingsJapgolly.chromeApps.chromeAppsStrings.ro
    - typingsJapgolly.chromeApps.chromeAppsStrings.ru
    - typingsJapgolly.chromeApps.chromeAppsStrings.sd
    - typingsJapgolly.chromeApps.chromeAppsStrings.sh
    - typingsJapgolly.chromeApps.chromeAppsStrings.si
    - typingsJapgolly.chromeApps.chromeAppsStrings.sk
    - typingsJapgolly.chromeApps.chromeAppsStrings.sl
    - typingsJapgolly.chromeApps.chromeAppsStrings.sm
    - typingsJapgolly.chromeApps.chromeAppsStrings.sn
    - typingsJapgolly.chromeApps.chromeAppsStrings.so
    - typingsJapgolly.chromeApps.chromeAppsStrings.sq
    - typingsJapgolly.chromeApps.chromeAppsStrings.sr
    - typingsJapgolly.chromeApps.chromeAppsStrings.st
    - typingsJapgolly.chromeApps.chromeAppsStrings.su
    - typingsJapgolly.chromeApps.chromeAppsStrings.sv
    - typingsJapgolly.chromeApps.chromeAppsStrings.sw
    - typingsJapgolly.chromeApps.chromeAppsStrings.ta
    - typingsJapgolly.chromeApps.chromeAppsStrings.te
    - typingsJapgolly.chromeApps.chromeAppsStrings.tg
    - typingsJapgolly.chromeApps.chromeAppsStrings.th
    - typingsJapgolly.chromeApps.chromeAppsStrings.ti
    - typingsJapgolly.chromeApps.chromeAppsStrings.tk
    - typingsJapgolly.chromeApps.chromeAppsStrings.to
    - typingsJapgolly.chromeApps.chromeAppsStrings.tr
    - typingsJapgolly.chromeApps.chromeAppsStrings.tt
    - typingsJapgolly.chromeApps.chromeAppsStrings.tw
    - typingsJapgolly.chromeApps.chromeAppsStrings.ug
    - typingsJapgolly.chromeApps.chromeAppsStrings.uk
    - typingsJapgolly.chromeApps.chromeAppsStrings.ur
    - typingsJapgolly.chromeApps.chromeAppsStrings.uz
    - typingsJapgolly.chromeApps.chromeAppsStrings.vi
    - typingsJapgolly.chromeApps.chromeAppsStrings.wa
    - typingsJapgolly.chromeApps.chromeAppsStrings.xh
    - typingsJapgolly.chromeApps.chromeAppsStrings.yi
    - typingsJapgolly.chromeApps.chromeAppsStrings.yo
    - typingsJapgolly.chromeApps.chromeAppsStrings.zh
    - typingsJapgolly.chromeApps.chromeAppsStrings.`zh-CN`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`zh-HK`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`zh-TW`
    - typingsJapgolly.chromeApps.chromeAppsStrings.zu
    - typingsJapgolly.chromeApps.chromeAppsStrings.ar_001
    - typingsJapgolly.chromeApps.chromeAppsStrings.en_001
    - typingsJapgolly.chromeApps.chromeAppsStrings.en_150
    - typingsJapgolly.chromeApps.chromeAppsStrings.zh_hans_cn
    - typingsJapgolly.chromeApps.chromeAppsStrings.zh_hant_hk
    - typingsJapgolly.chromeApps.chromeAppsStrings.zh_hant_mo
    - typingsJapgolly.chromeApps.chromeAppsStrings.zh_hans_sg
    - typingsJapgolly.chromeApps.chromeAppsStrings.zh_hant_tw
  */
  trait LanguageCode extends StObject
  object LanguageCode {
    
    inline def af: typingsJapgolly.chromeApps.chromeAppsStrings.af = "af".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.af]
    
    inline def am: typingsJapgolly.chromeApps.chromeAppsStrings.am = "am".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.am]
    
    inline def an: typingsJapgolly.chromeApps.chromeAppsStrings.an = "an".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.an]
    
    inline def ar: typingsJapgolly.chromeApps.chromeAppsStrings.ar = "ar".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ar]
    
    inline def ar_001: typingsJapgolly.chromeApps.chromeAppsStrings.ar_001 = "ar_001".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ar_001]
    
    inline def ast: typingsJapgolly.chromeApps.chromeAppsStrings.ast = "ast".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ast]
    
    inline def az: typingsJapgolly.chromeApps.chromeAppsStrings.az = "az".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.az]
    
    inline def be: typingsJapgolly.chromeApps.chromeAppsStrings.be = "be".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.be]
    
    inline def bg: typingsJapgolly.chromeApps.chromeAppsStrings.bg = "bg".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.bg]
    
    inline def bh: typingsJapgolly.chromeApps.chromeAppsStrings.bh = "bh".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.bh]
    
    inline def bn: typingsJapgolly.chromeApps.chromeAppsStrings.bn = "bn".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.bn]
    
    inline def br: typingsJapgolly.chromeApps.chromeAppsStrings.br = "br".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.br]
    
    inline def bs: typingsJapgolly.chromeApps.chromeAppsStrings.bs = "bs".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.bs]
    
    inline def ca: typingsJapgolly.chromeApps.chromeAppsStrings.ca = "ca".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ca]
    
    inline def ceb: typingsJapgolly.chromeApps.chromeAppsStrings.ceb = "ceb".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ceb]
    
    inline def ckb: typingsJapgolly.chromeApps.chromeAppsStrings.ckb = "ckb".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ckb]
    
    inline def co: typingsJapgolly.chromeApps.chromeAppsStrings.co = "co".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.co]
    
    inline def cs: typingsJapgolly.chromeApps.chromeAppsStrings.cs = "cs".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.cs]
    
    inline def cy: typingsJapgolly.chromeApps.chromeAppsStrings.cy = "cy".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.cy]
    
    inline def da: typingsJapgolly.chromeApps.chromeAppsStrings.da = "da".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.da]
    
    inline def de: typingsJapgolly.chromeApps.chromeAppsStrings.de = "de".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.de]
    
    inline def `de-AT`: typingsJapgolly.chromeApps.chromeAppsStrings.`de-AT` = "de-AT".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`de-AT`]
    
    inline def `de-CH`: typingsJapgolly.chromeApps.chromeAppsStrings.`de-CH` = "de-CH".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`de-CH`]
    
    inline def `de-DE`: typingsJapgolly.chromeApps.chromeAppsStrings.`de-DE` = "de-DE".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`de-DE`]
    
    inline def `de-LI`: typingsJapgolly.chromeApps.chromeAppsStrings.`de-LI` = "de-LI".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`de-LI`]
    
    inline def el: typingsJapgolly.chromeApps.chromeAppsStrings.el = "el".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.el]
    
    inline def en: typingsJapgolly.chromeApps.chromeAppsStrings.en = "en".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.en]
    
    inline def `en-AU`: typingsJapgolly.chromeApps.chromeAppsStrings.`en-AU` = "en-AU".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`en-AU`]
    
    inline def `en-CA`: typingsJapgolly.chromeApps.chromeAppsStrings.`en-CA` = "en-CA".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`en-CA`]
    
    inline def `en-GB`: typingsJapgolly.chromeApps.chromeAppsStrings.`en-GB` = "en-GB".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`en-GB`]
    
    inline def `en-IN`: typingsJapgolly.chromeApps.chromeAppsStrings.`en-IN` = "en-IN".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`en-IN`]
    
    inline def `en-NZ`: typingsJapgolly.chromeApps.chromeAppsStrings.`en-NZ` = "en-NZ".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`en-NZ`]
    
    inline def `en-US`: typingsJapgolly.chromeApps.chromeAppsStrings.`en-US` = "en-US".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`en-US`]
    
    inline def `en-ZA`: typingsJapgolly.chromeApps.chromeAppsStrings.`en-ZA` = "en-ZA".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`en-ZA`]
    
    inline def en_001: typingsJapgolly.chromeApps.chromeAppsStrings.en_001 = "en_001".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.en_001]
    
    inline def en_150: typingsJapgolly.chromeApps.chromeAppsStrings.en_150 = "en_150".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.en_150]
    
    inline def eo: typingsJapgolly.chromeApps.chromeAppsStrings.eo = "eo".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.eo]
    
    inline def es: typingsJapgolly.chromeApps.chromeAppsStrings.es = "es".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.es]
    
    inline def `es-419`: typingsJapgolly.chromeApps.chromeAppsStrings.`es-419` = "es-419".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`es-419`]
    
    inline def `es-AR`: typingsJapgolly.chromeApps.chromeAppsStrings.`es-AR` = "es-AR".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`es-AR`]
    
    inline def `es-CL`: typingsJapgolly.chromeApps.chromeAppsStrings.`es-CL` = "es-CL".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`es-CL`]
    
    inline def `es-CO`: typingsJapgolly.chromeApps.chromeAppsStrings.`es-CO` = "es-CO".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`es-CO`]
    
    inline def `es-CR`: typingsJapgolly.chromeApps.chromeAppsStrings.`es-CR` = "es-CR".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`es-CR`]
    
    inline def `es-ES`: typingsJapgolly.chromeApps.chromeAppsStrings.`es-ES` = "es-ES".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`es-ES`]
    
    inline def `es-HN`: typingsJapgolly.chromeApps.chromeAppsStrings.`es-HN` = "es-HN".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`es-HN`]
    
    inline def `es-MX`: typingsJapgolly.chromeApps.chromeAppsStrings.`es-MX` = "es-MX".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`es-MX`]
    
    inline def `es-PE`: typingsJapgolly.chromeApps.chromeAppsStrings.`es-PE` = "es-PE".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`es-PE`]
    
    inline def `es-US`: typingsJapgolly.chromeApps.chromeAppsStrings.`es-US` = "es-US".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`es-US`]
    
    inline def `es-UY`: typingsJapgolly.chromeApps.chromeAppsStrings.`es-UY` = "es-UY".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`es-UY`]
    
    inline def `es-VE`: typingsJapgolly.chromeApps.chromeAppsStrings.`es-VE` = "es-VE".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`es-VE`]
    
    inline def et: typingsJapgolly.chromeApps.chromeAppsStrings.et = "et".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.et]
    
    inline def eu: typingsJapgolly.chromeApps.chromeAppsStrings.eu = "eu".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.eu]
    
    inline def fa: typingsJapgolly.chromeApps.chromeAppsStrings.fa = "fa".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.fa]
    
    inline def fi: typingsJapgolly.chromeApps.chromeAppsStrings.fi = "fi".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.fi]
    
    inline def fil: typingsJapgolly.chromeApps.chromeAppsStrings.fil = "fil".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.fil]
    
    inline def fo: typingsJapgolly.chromeApps.chromeAppsStrings.fo = "fo".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.fo]
    
    inline def fr: typingsJapgolly.chromeApps.chromeAppsStrings.fr = "fr".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.fr]
    
    inline def `fr-CA`: typingsJapgolly.chromeApps.chromeAppsStrings.`fr-CA` = "fr-CA".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`fr-CA`]
    
    inline def `fr-CH`: typingsJapgolly.chromeApps.chromeAppsStrings.`fr-CH` = "fr-CH".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`fr-CH`]
    
    inline def `fr-FR`: typingsJapgolly.chromeApps.chromeAppsStrings.`fr-FR` = "fr-FR".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`fr-FR`]
    
    inline def fy: typingsJapgolly.chromeApps.chromeAppsStrings.fy = "fy".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.fy]
    
    inline def ga: typingsJapgolly.chromeApps.chromeAppsStrings.ga = "ga".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ga]
    
    inline def gd: typingsJapgolly.chromeApps.chromeAppsStrings.gd = "gd".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.gd]
    
    inline def gl: typingsJapgolly.chromeApps.chromeAppsStrings.gl = "gl".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.gl]
    
    inline def gn: typingsJapgolly.chromeApps.chromeAppsStrings.gn = "gn".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.gn]
    
    inline def gu: typingsJapgolly.chromeApps.chromeAppsStrings.gu = "gu".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.gu]
    
    inline def ha: typingsJapgolly.chromeApps.chromeAppsStrings.ha = "ha".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ha]
    
    inline def haw: typingsJapgolly.chromeApps.chromeAppsStrings.haw = "haw".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.haw]
    
    inline def he: typingsJapgolly.chromeApps.chromeAppsStrings.he = "he".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.he]
    
    inline def hi: typingsJapgolly.chromeApps.chromeAppsStrings.hi = "hi".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.hi]
    
    inline def hmn: typingsJapgolly.chromeApps.chromeAppsStrings.hmn = "hmn".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.hmn]
    
    inline def hr: typingsJapgolly.chromeApps.chromeAppsStrings.hr = "hr".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.hr]
    
    inline def ht: typingsJapgolly.chromeApps.chromeAppsStrings.ht = "ht".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ht]
    
    inline def hu: typingsJapgolly.chromeApps.chromeAppsStrings.hu = "hu".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.hu]
    
    inline def hy: typingsJapgolly.chromeApps.chromeAppsStrings.hy = "hy".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.hy]
    
    inline def ia: typingsJapgolly.chromeApps.chromeAppsStrings.ia = "ia".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ia]
    
    inline def id: typingsJapgolly.chromeApps.chromeAppsStrings.id = "id".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.id]
    
    inline def ig: typingsJapgolly.chromeApps.chromeAppsStrings.ig = "ig".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ig]
    
    inline def is: typingsJapgolly.chromeApps.chromeAppsStrings.is = "is".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.is]
    
    inline def it: typingsJapgolly.chromeApps.chromeAppsStrings.it = "it".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.it]
    
    inline def `it-CH`: typingsJapgolly.chromeApps.chromeAppsStrings.`it-CH` = "it-CH".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`it-CH`]
    
    inline def `it-IT`: typingsJapgolly.chromeApps.chromeAppsStrings.`it-IT` = "it-IT".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`it-IT`]
    
    inline def ja: typingsJapgolly.chromeApps.chromeAppsStrings.ja = "ja".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ja]
    
    inline def jv: typingsJapgolly.chromeApps.chromeAppsStrings.jv = "jv".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.jv]
    
    inline def ka: typingsJapgolly.chromeApps.chromeAppsStrings.ka = "ka".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ka]
    
    inline def kk: typingsJapgolly.chromeApps.chromeAppsStrings.kk = "kk".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.kk]
    
    inline def km: typingsJapgolly.chromeApps.chromeAppsStrings.km = "km".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.km]
    
    inline def kn: typingsJapgolly.chromeApps.chromeAppsStrings.kn = "kn".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.kn]
    
    inline def ko: typingsJapgolly.chromeApps.chromeAppsStrings.ko = "ko".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ko]
    
    inline def ku: typingsJapgolly.chromeApps.chromeAppsStrings.ku = "ku".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ku]
    
    inline def ky: typingsJapgolly.chromeApps.chromeAppsStrings.ky = "ky".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ky]
    
    inline def la: typingsJapgolly.chromeApps.chromeAppsStrings.la = "la".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.la]
    
    inline def lb: typingsJapgolly.chromeApps.chromeAppsStrings.lb = "lb".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.lb]
    
    inline def ln: typingsJapgolly.chromeApps.chromeAppsStrings.ln = "ln".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ln]
    
    inline def lo: typingsJapgolly.chromeApps.chromeAppsStrings.lo = "lo".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.lo]
    
    inline def lt: typingsJapgolly.chromeApps.chromeAppsStrings.lt = "lt".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.lt]
    
    inline def lv: typingsJapgolly.chromeApps.chromeAppsStrings.lv = "lv".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.lv]
    
    inline def mg: typingsJapgolly.chromeApps.chromeAppsStrings.mg = "mg".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.mg]
    
    inline def mi: typingsJapgolly.chromeApps.chromeAppsStrings.mi = "mi".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.mi]
    
    inline def mk: typingsJapgolly.chromeApps.chromeAppsStrings.mk = "mk".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.mk]
    
    inline def ml: typingsJapgolly.chromeApps.chromeAppsStrings.ml = "ml".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ml]
    
    inline def mn: typingsJapgolly.chromeApps.chromeAppsStrings.mn = "mn".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.mn]
    
    inline def mo: typingsJapgolly.chromeApps.chromeAppsStrings.mo = "mo".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.mo]
    
    inline def mr: typingsJapgolly.chromeApps.chromeAppsStrings.mr = "mr".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.mr]
    
    inline def ms: typingsJapgolly.chromeApps.chromeAppsStrings.ms = "ms".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ms]
    
    inline def mt: typingsJapgolly.chromeApps.chromeAppsStrings.mt = "mt".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.mt]
    
    inline def my: typingsJapgolly.chromeApps.chromeAppsStrings.my = "my".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.my]
    
    inline def nb: typingsJapgolly.chromeApps.chromeAppsStrings.nb = "nb".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.nb]
    
    inline def ne: typingsJapgolly.chromeApps.chromeAppsStrings.ne = "ne".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ne]
    
    inline def nl: typingsJapgolly.chromeApps.chromeAppsStrings.nl = "nl".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.nl]
    
    inline def nn: typingsJapgolly.chromeApps.chromeAppsStrings.nn = "nn".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.nn]
    
    inline def no: typingsJapgolly.chromeApps.chromeAppsStrings.no = "no".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.no]
    
    inline def ny: typingsJapgolly.chromeApps.chromeAppsStrings.ny = "ny".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ny]
    
    inline def oc: typingsJapgolly.chromeApps.chromeAppsStrings.oc = "oc".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.oc]
    
    inline def om: typingsJapgolly.chromeApps.chromeAppsStrings.om = "om".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.om]
    
    inline def or: typingsJapgolly.chromeApps.chromeAppsStrings.or = "or".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.or]
    
    inline def pa: typingsJapgolly.chromeApps.chromeAppsStrings.pa = "pa".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.pa]
    
    inline def pl: typingsJapgolly.chromeApps.chromeAppsStrings.pl = "pl".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.pl]
    
    inline def ps: typingsJapgolly.chromeApps.chromeAppsStrings.ps = "ps".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ps]
    
    inline def pt: typingsJapgolly.chromeApps.chromeAppsStrings.pt = "pt".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.pt]
    
    inline def `pt-BR`: typingsJapgolly.chromeApps.chromeAppsStrings.`pt-BR` = "pt-BR".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`pt-BR`]
    
    inline def `pt-PT`: typingsJapgolly.chromeApps.chromeAppsStrings.`pt-PT` = "pt-PT".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`pt-PT`]
    
    inline def qu: typingsJapgolly.chromeApps.chromeAppsStrings.qu = "qu".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.qu]
    
    inline def rm: typingsJapgolly.chromeApps.chromeAppsStrings.rm = "rm".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.rm]
    
    inline def ro: typingsJapgolly.chromeApps.chromeAppsStrings.ro = "ro".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ro]
    
    inline def ru: typingsJapgolly.chromeApps.chromeAppsStrings.ru = "ru".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ru]
    
    inline def sd: typingsJapgolly.chromeApps.chromeAppsStrings.sd = "sd".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.sd]
    
    inline def sh: typingsJapgolly.chromeApps.chromeAppsStrings.sh = "sh".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.sh]
    
    inline def si: typingsJapgolly.chromeApps.chromeAppsStrings.si = "si".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.si]
    
    inline def sk: typingsJapgolly.chromeApps.chromeAppsStrings.sk = "sk".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.sk]
    
    inline def sl: typingsJapgolly.chromeApps.chromeAppsStrings.sl = "sl".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.sl]
    
    inline def sm: typingsJapgolly.chromeApps.chromeAppsStrings.sm = "sm".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.sm]
    
    inline def sn: typingsJapgolly.chromeApps.chromeAppsStrings.sn = "sn".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.sn]
    
    inline def so: typingsJapgolly.chromeApps.chromeAppsStrings.so = "so".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.so]
    
    inline def sq: typingsJapgolly.chromeApps.chromeAppsStrings.sq = "sq".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.sq]
    
    inline def sr: typingsJapgolly.chromeApps.chromeAppsStrings.sr = "sr".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.sr]
    
    inline def st: typingsJapgolly.chromeApps.chromeAppsStrings.st = "st".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.st]
    
    inline def su: typingsJapgolly.chromeApps.chromeAppsStrings.su = "su".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.su]
    
    inline def sv: typingsJapgolly.chromeApps.chromeAppsStrings.sv = "sv".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.sv]
    
    inline def sw: typingsJapgolly.chromeApps.chromeAppsStrings.sw = "sw".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.sw]
    
    inline def ta: typingsJapgolly.chromeApps.chromeAppsStrings.ta = "ta".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ta]
    
    inline def te: typingsJapgolly.chromeApps.chromeAppsStrings.te = "te".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.te]
    
    inline def tg: typingsJapgolly.chromeApps.chromeAppsStrings.tg = "tg".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.tg]
    
    inline def th: typingsJapgolly.chromeApps.chromeAppsStrings.th = "th".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.th]
    
    inline def ti: typingsJapgolly.chromeApps.chromeAppsStrings.ti = "ti".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ti]
    
    inline def tk: typingsJapgolly.chromeApps.chromeAppsStrings.tk = "tk".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.tk]
    
    inline def to: typingsJapgolly.chromeApps.chromeAppsStrings.to = "to".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.to]
    
    inline def tr: typingsJapgolly.chromeApps.chromeAppsStrings.tr = "tr".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.tr]
    
    inline def tt: typingsJapgolly.chromeApps.chromeAppsStrings.tt = "tt".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.tt]
    
    inline def tw: typingsJapgolly.chromeApps.chromeAppsStrings.tw = "tw".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.tw]
    
    inline def ug: typingsJapgolly.chromeApps.chromeAppsStrings.ug = "ug".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ug]
    
    inline def uk: typingsJapgolly.chromeApps.chromeAppsStrings.uk = "uk".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.uk]
    
    inline def und: typingsJapgolly.chromeApps.chromeAppsStrings.und = "und".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.und]
    
    inline def ur: typingsJapgolly.chromeApps.chromeAppsStrings.ur = "ur".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ur]
    
    inline def uz: typingsJapgolly.chromeApps.chromeAppsStrings.uz = "uz".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.uz]
    
    inline def vi: typingsJapgolly.chromeApps.chromeAppsStrings.vi = "vi".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.vi]
    
    inline def wa: typingsJapgolly.chromeApps.chromeAppsStrings.wa = "wa".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.wa]
    
    inline def xh: typingsJapgolly.chromeApps.chromeAppsStrings.xh = "xh".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.xh]
    
    inline def yi: typingsJapgolly.chromeApps.chromeAppsStrings.yi = "yi".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.yi]
    
    inline def yo: typingsJapgolly.chromeApps.chromeAppsStrings.yo = "yo".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.yo]
    
    inline def zh: typingsJapgolly.chromeApps.chromeAppsStrings.zh = "zh".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.zh]
    
    inline def `zh-CN`: typingsJapgolly.chromeApps.chromeAppsStrings.`zh-CN` = "zh-CN".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`zh-CN`]
    
    inline def `zh-HK`: typingsJapgolly.chromeApps.chromeAppsStrings.`zh-HK` = "zh-HK".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`zh-HK`]
    
    inline def `zh-TW`: typingsJapgolly.chromeApps.chromeAppsStrings.`zh-TW` = "zh-TW".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`zh-TW`]
    
    inline def zh_hans_cn: typingsJapgolly.chromeApps.chromeAppsStrings.zh_hans_cn = "zh_hans_cn".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.zh_hans_cn]
    
    inline def zh_hans_sg: typingsJapgolly.chromeApps.chromeAppsStrings.zh_hans_sg = "zh_hans_sg".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.zh_hans_sg]
    
    inline def zh_hant_hk: typingsJapgolly.chromeApps.chromeAppsStrings.zh_hant_hk = "zh_hant_hk".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.zh_hant_hk]
    
    inline def zh_hant_mo: typingsJapgolly.chromeApps.chromeAppsStrings.zh_hant_mo = "zh_hant_mo".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.zh_hant_mo]
    
    inline def zh_hant_tw: typingsJapgolly.chromeApps.chromeAppsStrings.zh_hant_tw = "zh_hant_tw".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.zh_hant_tw]
    
    inline def zu: typingsJapgolly.chromeApps.chromeAppsStrings.zu = "zu".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.zu]
  }
  
  /** Holds detected language reliability and array of DetectedLanguage */
  trait LanguageDetectionResult extends StObject {
    
    /** CLD detected language reliability */
    var isReliable: Boolean
    
    /** Array of DetectedLanguage */
    var languages: js.Array[DetectedLanguage]
  }
  object LanguageDetectionResult {
    
    inline def apply(isReliable: Boolean, languages: js.Array[DetectedLanguage]): LanguageDetectionResult = {
      val __obj = js.Dynamic.literal(isReliable = isReliable.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any])
      __obj.asInstanceOf[LanguageDetectionResult]
    }
    
    extension [Self <: LanguageDetectionResult](x: Self) {
      
      inline def setIsReliable(value: Boolean): Self = StObject.set(x, "isReliable", value.asInstanceOf[js.Any])
      
      inline def setLanguages(value: js.Array[DetectedLanguage]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
      
      inline def setLanguagesVarargs(value: DetectedLanguage*): Self = StObject.set(x, "languages", js.Array(value*))
    }
  }
  
  /** Allow array of strings with length 1 to 9 */
  type StringSubstitutions = js.Array[String] | (js.Tuple2[String, String]) | (js.Tuple3[String, String, String]) | (js.Tuple4[String, String, String, String]) | (js.Tuple5[String, String, String, String, String]) | (js.Tuple6[String, String, String, String, String, String]) | (js.Tuple7[String, String, String, String, String, String, String]) | (js.Tuple8[String, String, String, String, String, String, String, String]) | (js.Tuple9[String, String, String, String, String, String, String, String, String])
  
  /**
    * @see[Source]{@link https://github.com/chromium/chromium/blob/master/ui/base/l10n/l10n_util.cc}
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.chromeApps.chromeAppsStrings.af
    - typingsJapgolly.chromeApps.chromeAppsStrings.am
    - typingsJapgolly.chromeApps.chromeAppsStrings.an
    - typingsJapgolly.chromeApps.chromeAppsStrings.ar
    - typingsJapgolly.chromeApps.chromeAppsStrings.ast
    - typingsJapgolly.chromeApps.chromeAppsStrings.az
    - typingsJapgolly.chromeApps.chromeAppsStrings.be
    - typingsJapgolly.chromeApps.chromeAppsStrings.bg
    - typingsJapgolly.chromeApps.chromeAppsStrings.bh
    - typingsJapgolly.chromeApps.chromeAppsStrings.bn
    - typingsJapgolly.chromeApps.chromeAppsStrings.br
    - typingsJapgolly.chromeApps.chromeAppsStrings.bs
    - typingsJapgolly.chromeApps.chromeAppsStrings.ca
    - typingsJapgolly.chromeApps.chromeAppsStrings.ceb
    - typingsJapgolly.chromeApps.chromeAppsStrings.ckb
    - typingsJapgolly.chromeApps.chromeAppsStrings.co
    - typingsJapgolly.chromeApps.chromeAppsStrings.cs
    - typingsJapgolly.chromeApps.chromeAppsStrings.cy
    - typingsJapgolly.chromeApps.chromeAppsStrings.da
    - typingsJapgolly.chromeApps.chromeAppsStrings.de
    - typingsJapgolly.chromeApps.chromeAppsStrings.`de-AT`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`de-CH`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`de-DE`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`de-LI`
    - typingsJapgolly.chromeApps.chromeAppsStrings.el
    - typingsJapgolly.chromeApps.chromeAppsStrings.en
    - typingsJapgolly.chromeApps.chromeAppsStrings.`en-AU`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`en-CA`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`en-GB`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`en-IN`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`en-NZ`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`en-US`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`en-ZA`
    - typingsJapgolly.chromeApps.chromeAppsStrings.eo
    - typingsJapgolly.chromeApps.chromeAppsStrings.es
    - typingsJapgolly.chromeApps.chromeAppsStrings.`es-419`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`es-AR`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`es-CL`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`es-CO`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`es-CR`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`es-ES`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`es-HN`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`es-MX`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`es-PE`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`es-US`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`es-UY`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`es-VE`
    - typingsJapgolly.chromeApps.chromeAppsStrings.et
    - typingsJapgolly.chromeApps.chromeAppsStrings.eu
    - typingsJapgolly.chromeApps.chromeAppsStrings.fa
    - typingsJapgolly.chromeApps.chromeAppsStrings.fi
    - typingsJapgolly.chromeApps.chromeAppsStrings.fil
    - typingsJapgolly.chromeApps.chromeAppsStrings.fo
    - typingsJapgolly.chromeApps.chromeAppsStrings.fr
    - typingsJapgolly.chromeApps.chromeAppsStrings.`fr-CA`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`fr-CH`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`fr-FR`
    - typingsJapgolly.chromeApps.chromeAppsStrings.fy
    - typingsJapgolly.chromeApps.chromeAppsStrings.ga
    - typingsJapgolly.chromeApps.chromeAppsStrings.gd
    - typingsJapgolly.chromeApps.chromeAppsStrings.gl
    - typingsJapgolly.chromeApps.chromeAppsStrings.gn
    - typingsJapgolly.chromeApps.chromeAppsStrings.gu
    - typingsJapgolly.chromeApps.chromeAppsStrings.ha
    - typingsJapgolly.chromeApps.chromeAppsStrings.haw
    - typingsJapgolly.chromeApps.chromeAppsStrings.he
    - typingsJapgolly.chromeApps.chromeAppsStrings.hi
    - typingsJapgolly.chromeApps.chromeAppsStrings.hmn
    - typingsJapgolly.chromeApps.chromeAppsStrings.hr
    - typingsJapgolly.chromeApps.chromeAppsStrings.ht
    - typingsJapgolly.chromeApps.chromeAppsStrings.hu
    - typingsJapgolly.chromeApps.chromeAppsStrings.hy
    - typingsJapgolly.chromeApps.chromeAppsStrings.ia
    - typingsJapgolly.chromeApps.chromeAppsStrings.id
    - typingsJapgolly.chromeApps.chromeAppsStrings.ig
    - typingsJapgolly.chromeApps.chromeAppsStrings.is
    - typingsJapgolly.chromeApps.chromeAppsStrings.it
    - typingsJapgolly.chromeApps.chromeAppsStrings.`it-CH`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`it-IT`
    - typingsJapgolly.chromeApps.chromeAppsStrings.ja
    - typingsJapgolly.chromeApps.chromeAppsStrings.jv
    - typingsJapgolly.chromeApps.chromeAppsStrings.ka
    - typingsJapgolly.chromeApps.chromeAppsStrings.kk
    - typingsJapgolly.chromeApps.chromeAppsStrings.km
    - typingsJapgolly.chromeApps.chromeAppsStrings.kn
    - typingsJapgolly.chromeApps.chromeAppsStrings.ko
    - typingsJapgolly.chromeApps.chromeAppsStrings.ku
    - typingsJapgolly.chromeApps.chromeAppsStrings.ky
    - typingsJapgolly.chromeApps.chromeAppsStrings.la
    - typingsJapgolly.chromeApps.chromeAppsStrings.lb
    - typingsJapgolly.chromeApps.chromeAppsStrings.ln
    - typingsJapgolly.chromeApps.chromeAppsStrings.lo
    - typingsJapgolly.chromeApps.chromeAppsStrings.lt
    - typingsJapgolly.chromeApps.chromeAppsStrings.lv
    - typingsJapgolly.chromeApps.chromeAppsStrings.mg
    - typingsJapgolly.chromeApps.chromeAppsStrings.mi
    - typingsJapgolly.chromeApps.chromeAppsStrings.mk
    - typingsJapgolly.chromeApps.chromeAppsStrings.ml
    - typingsJapgolly.chromeApps.chromeAppsStrings.mn
    - typingsJapgolly.chromeApps.chromeAppsStrings.mo
    - typingsJapgolly.chromeApps.chromeAppsStrings.mr
    - typingsJapgolly.chromeApps.chromeAppsStrings.ms
    - typingsJapgolly.chromeApps.chromeAppsStrings.mt
    - typingsJapgolly.chromeApps.chromeAppsStrings.my
    - typingsJapgolly.chromeApps.chromeAppsStrings.nb
    - typingsJapgolly.chromeApps.chromeAppsStrings.ne
    - typingsJapgolly.chromeApps.chromeAppsStrings.nl
    - typingsJapgolly.chromeApps.chromeAppsStrings.nn
    - typingsJapgolly.chromeApps.chromeAppsStrings.no
    - typingsJapgolly.chromeApps.chromeAppsStrings.ny
    - typingsJapgolly.chromeApps.chromeAppsStrings.oc
    - typingsJapgolly.chromeApps.chromeAppsStrings.om
    - typingsJapgolly.chromeApps.chromeAppsStrings.or
    - typingsJapgolly.chromeApps.chromeAppsStrings.pa
    - typingsJapgolly.chromeApps.chromeAppsStrings.pl
    - typingsJapgolly.chromeApps.chromeAppsStrings.ps
    - typingsJapgolly.chromeApps.chromeAppsStrings.pt
    - typingsJapgolly.chromeApps.chromeAppsStrings.`pt-BR`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`pt-PT`
    - typingsJapgolly.chromeApps.chromeAppsStrings.qu
    - typingsJapgolly.chromeApps.chromeAppsStrings.rm
    - typingsJapgolly.chromeApps.chromeAppsStrings.ro
    - typingsJapgolly.chromeApps.chromeAppsStrings.ru
    - typingsJapgolly.chromeApps.chromeAppsStrings.sd
    - typingsJapgolly.chromeApps.chromeAppsStrings.sh
    - typingsJapgolly.chromeApps.chromeAppsStrings.si
    - typingsJapgolly.chromeApps.chromeAppsStrings.sk
    - typingsJapgolly.chromeApps.chromeAppsStrings.sl
    - typingsJapgolly.chromeApps.chromeAppsStrings.sm
    - typingsJapgolly.chromeApps.chromeAppsStrings.sn
    - typingsJapgolly.chromeApps.chromeAppsStrings.so
    - typingsJapgolly.chromeApps.chromeAppsStrings.sq
    - typingsJapgolly.chromeApps.chromeAppsStrings.sr
    - typingsJapgolly.chromeApps.chromeAppsStrings.st
    - typingsJapgolly.chromeApps.chromeAppsStrings.su
    - typingsJapgolly.chromeApps.chromeAppsStrings.sv
    - typingsJapgolly.chromeApps.chromeAppsStrings.sw
    - typingsJapgolly.chromeApps.chromeAppsStrings.ta
    - typingsJapgolly.chromeApps.chromeAppsStrings.te
    - typingsJapgolly.chromeApps.chromeAppsStrings.tg
    - typingsJapgolly.chromeApps.chromeAppsStrings.th
    - typingsJapgolly.chromeApps.chromeAppsStrings.ti
    - typingsJapgolly.chromeApps.chromeAppsStrings.tk
    - typingsJapgolly.chromeApps.chromeAppsStrings.to
    - typingsJapgolly.chromeApps.chromeAppsStrings.tr
    - typingsJapgolly.chromeApps.chromeAppsStrings.tt
    - typingsJapgolly.chromeApps.chromeAppsStrings.tw
    - typingsJapgolly.chromeApps.chromeAppsStrings.ug
    - typingsJapgolly.chromeApps.chromeAppsStrings.uk
    - typingsJapgolly.chromeApps.chromeAppsStrings.ur
    - typingsJapgolly.chromeApps.chromeAppsStrings.uz
    - typingsJapgolly.chromeApps.chromeAppsStrings.vi
    - typingsJapgolly.chromeApps.chromeAppsStrings.wa
    - typingsJapgolly.chromeApps.chromeAppsStrings.xh
    - typingsJapgolly.chromeApps.chromeAppsStrings.yi
    - typingsJapgolly.chromeApps.chromeAppsStrings.yo
    - typingsJapgolly.chromeApps.chromeAppsStrings.zh
    - typingsJapgolly.chromeApps.chromeAppsStrings.`zh-CN`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`zh-HK`
    - typingsJapgolly.chromeApps.chromeAppsStrings.`zh-TW`
    - typingsJapgolly.chromeApps.chromeAppsStrings.zu
    - typingsJapgolly.chromeApps.chromeAppsStrings.ar_001
    - typingsJapgolly.chromeApps.chromeAppsStrings.en_001
    - typingsJapgolly.chromeApps.chromeAppsStrings.en_150
    - typingsJapgolly.chromeApps.chromeAppsStrings.zh_hans_cn
    - typingsJapgolly.chromeApps.chromeAppsStrings.zh_hant_hk
    - typingsJapgolly.chromeApps.chromeAppsStrings.zh_hant_mo
    - typingsJapgolly.chromeApps.chromeAppsStrings.zh_hans_sg
    - typingsJapgolly.chromeApps.chromeAppsStrings.zh_hant_tw
  */
  trait kLanguageInfoTable extends StObject
  object kLanguageInfoTable {
    
    inline def af: typingsJapgolly.chromeApps.chromeAppsStrings.af = "af".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.af]
    
    inline def am: typingsJapgolly.chromeApps.chromeAppsStrings.am = "am".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.am]
    
    inline def an: typingsJapgolly.chromeApps.chromeAppsStrings.an = "an".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.an]
    
    inline def ar: typingsJapgolly.chromeApps.chromeAppsStrings.ar = "ar".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ar]
    
    inline def ar_001: typingsJapgolly.chromeApps.chromeAppsStrings.ar_001 = "ar_001".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ar_001]
    
    inline def ast: typingsJapgolly.chromeApps.chromeAppsStrings.ast = "ast".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ast]
    
    inline def az: typingsJapgolly.chromeApps.chromeAppsStrings.az = "az".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.az]
    
    inline def be: typingsJapgolly.chromeApps.chromeAppsStrings.be = "be".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.be]
    
    inline def bg: typingsJapgolly.chromeApps.chromeAppsStrings.bg = "bg".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.bg]
    
    inline def bh: typingsJapgolly.chromeApps.chromeAppsStrings.bh = "bh".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.bh]
    
    inline def bn: typingsJapgolly.chromeApps.chromeAppsStrings.bn = "bn".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.bn]
    
    inline def br: typingsJapgolly.chromeApps.chromeAppsStrings.br = "br".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.br]
    
    inline def bs: typingsJapgolly.chromeApps.chromeAppsStrings.bs = "bs".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.bs]
    
    inline def ca: typingsJapgolly.chromeApps.chromeAppsStrings.ca = "ca".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ca]
    
    inline def ceb: typingsJapgolly.chromeApps.chromeAppsStrings.ceb = "ceb".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ceb]
    
    inline def ckb: typingsJapgolly.chromeApps.chromeAppsStrings.ckb = "ckb".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ckb]
    
    inline def co: typingsJapgolly.chromeApps.chromeAppsStrings.co = "co".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.co]
    
    inline def cs: typingsJapgolly.chromeApps.chromeAppsStrings.cs = "cs".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.cs]
    
    inline def cy: typingsJapgolly.chromeApps.chromeAppsStrings.cy = "cy".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.cy]
    
    inline def da: typingsJapgolly.chromeApps.chromeAppsStrings.da = "da".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.da]
    
    inline def de: typingsJapgolly.chromeApps.chromeAppsStrings.de = "de".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.de]
    
    inline def `de-AT`: typingsJapgolly.chromeApps.chromeAppsStrings.`de-AT` = "de-AT".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`de-AT`]
    
    inline def `de-CH`: typingsJapgolly.chromeApps.chromeAppsStrings.`de-CH` = "de-CH".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`de-CH`]
    
    inline def `de-DE`: typingsJapgolly.chromeApps.chromeAppsStrings.`de-DE` = "de-DE".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`de-DE`]
    
    inline def `de-LI`: typingsJapgolly.chromeApps.chromeAppsStrings.`de-LI` = "de-LI".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`de-LI`]
    
    inline def el: typingsJapgolly.chromeApps.chromeAppsStrings.el = "el".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.el]
    
    inline def en: typingsJapgolly.chromeApps.chromeAppsStrings.en = "en".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.en]
    
    inline def `en-AU`: typingsJapgolly.chromeApps.chromeAppsStrings.`en-AU` = "en-AU".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`en-AU`]
    
    inline def `en-CA`: typingsJapgolly.chromeApps.chromeAppsStrings.`en-CA` = "en-CA".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`en-CA`]
    
    inline def `en-GB`: typingsJapgolly.chromeApps.chromeAppsStrings.`en-GB` = "en-GB".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`en-GB`]
    
    inline def `en-IN`: typingsJapgolly.chromeApps.chromeAppsStrings.`en-IN` = "en-IN".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`en-IN`]
    
    inline def `en-NZ`: typingsJapgolly.chromeApps.chromeAppsStrings.`en-NZ` = "en-NZ".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`en-NZ`]
    
    inline def `en-US`: typingsJapgolly.chromeApps.chromeAppsStrings.`en-US` = "en-US".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`en-US`]
    
    inline def `en-ZA`: typingsJapgolly.chromeApps.chromeAppsStrings.`en-ZA` = "en-ZA".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`en-ZA`]
    
    inline def en_001: typingsJapgolly.chromeApps.chromeAppsStrings.en_001 = "en_001".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.en_001]
    
    inline def en_150: typingsJapgolly.chromeApps.chromeAppsStrings.en_150 = "en_150".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.en_150]
    
    inline def eo: typingsJapgolly.chromeApps.chromeAppsStrings.eo = "eo".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.eo]
    
    inline def es: typingsJapgolly.chromeApps.chromeAppsStrings.es = "es".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.es]
    
    inline def `es-419`: typingsJapgolly.chromeApps.chromeAppsStrings.`es-419` = "es-419".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`es-419`]
    
    inline def `es-AR`: typingsJapgolly.chromeApps.chromeAppsStrings.`es-AR` = "es-AR".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`es-AR`]
    
    inline def `es-CL`: typingsJapgolly.chromeApps.chromeAppsStrings.`es-CL` = "es-CL".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`es-CL`]
    
    inline def `es-CO`: typingsJapgolly.chromeApps.chromeAppsStrings.`es-CO` = "es-CO".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`es-CO`]
    
    inline def `es-CR`: typingsJapgolly.chromeApps.chromeAppsStrings.`es-CR` = "es-CR".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`es-CR`]
    
    inline def `es-ES`: typingsJapgolly.chromeApps.chromeAppsStrings.`es-ES` = "es-ES".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`es-ES`]
    
    inline def `es-HN`: typingsJapgolly.chromeApps.chromeAppsStrings.`es-HN` = "es-HN".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`es-HN`]
    
    inline def `es-MX`: typingsJapgolly.chromeApps.chromeAppsStrings.`es-MX` = "es-MX".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`es-MX`]
    
    inline def `es-PE`: typingsJapgolly.chromeApps.chromeAppsStrings.`es-PE` = "es-PE".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`es-PE`]
    
    inline def `es-US`: typingsJapgolly.chromeApps.chromeAppsStrings.`es-US` = "es-US".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`es-US`]
    
    inline def `es-UY`: typingsJapgolly.chromeApps.chromeAppsStrings.`es-UY` = "es-UY".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`es-UY`]
    
    inline def `es-VE`: typingsJapgolly.chromeApps.chromeAppsStrings.`es-VE` = "es-VE".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`es-VE`]
    
    inline def et: typingsJapgolly.chromeApps.chromeAppsStrings.et = "et".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.et]
    
    inline def eu: typingsJapgolly.chromeApps.chromeAppsStrings.eu = "eu".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.eu]
    
    inline def fa: typingsJapgolly.chromeApps.chromeAppsStrings.fa = "fa".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.fa]
    
    inline def fi: typingsJapgolly.chromeApps.chromeAppsStrings.fi = "fi".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.fi]
    
    inline def fil: typingsJapgolly.chromeApps.chromeAppsStrings.fil = "fil".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.fil]
    
    inline def fo: typingsJapgolly.chromeApps.chromeAppsStrings.fo = "fo".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.fo]
    
    inline def fr: typingsJapgolly.chromeApps.chromeAppsStrings.fr = "fr".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.fr]
    
    inline def `fr-CA`: typingsJapgolly.chromeApps.chromeAppsStrings.`fr-CA` = "fr-CA".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`fr-CA`]
    
    inline def `fr-CH`: typingsJapgolly.chromeApps.chromeAppsStrings.`fr-CH` = "fr-CH".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`fr-CH`]
    
    inline def `fr-FR`: typingsJapgolly.chromeApps.chromeAppsStrings.`fr-FR` = "fr-FR".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`fr-FR`]
    
    inline def fy: typingsJapgolly.chromeApps.chromeAppsStrings.fy = "fy".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.fy]
    
    inline def ga: typingsJapgolly.chromeApps.chromeAppsStrings.ga = "ga".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ga]
    
    inline def gd: typingsJapgolly.chromeApps.chromeAppsStrings.gd = "gd".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.gd]
    
    inline def gl: typingsJapgolly.chromeApps.chromeAppsStrings.gl = "gl".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.gl]
    
    inline def gn: typingsJapgolly.chromeApps.chromeAppsStrings.gn = "gn".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.gn]
    
    inline def gu: typingsJapgolly.chromeApps.chromeAppsStrings.gu = "gu".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.gu]
    
    inline def ha: typingsJapgolly.chromeApps.chromeAppsStrings.ha = "ha".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ha]
    
    inline def haw: typingsJapgolly.chromeApps.chromeAppsStrings.haw = "haw".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.haw]
    
    inline def he: typingsJapgolly.chromeApps.chromeAppsStrings.he = "he".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.he]
    
    inline def hi: typingsJapgolly.chromeApps.chromeAppsStrings.hi = "hi".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.hi]
    
    inline def hmn: typingsJapgolly.chromeApps.chromeAppsStrings.hmn = "hmn".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.hmn]
    
    inline def hr: typingsJapgolly.chromeApps.chromeAppsStrings.hr = "hr".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.hr]
    
    inline def ht: typingsJapgolly.chromeApps.chromeAppsStrings.ht = "ht".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ht]
    
    inline def hu: typingsJapgolly.chromeApps.chromeAppsStrings.hu = "hu".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.hu]
    
    inline def hy: typingsJapgolly.chromeApps.chromeAppsStrings.hy = "hy".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.hy]
    
    inline def ia: typingsJapgolly.chromeApps.chromeAppsStrings.ia = "ia".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ia]
    
    inline def id: typingsJapgolly.chromeApps.chromeAppsStrings.id = "id".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.id]
    
    inline def ig: typingsJapgolly.chromeApps.chromeAppsStrings.ig = "ig".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ig]
    
    inline def is: typingsJapgolly.chromeApps.chromeAppsStrings.is = "is".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.is]
    
    inline def it: typingsJapgolly.chromeApps.chromeAppsStrings.it = "it".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.it]
    
    inline def `it-CH`: typingsJapgolly.chromeApps.chromeAppsStrings.`it-CH` = "it-CH".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`it-CH`]
    
    inline def `it-IT`: typingsJapgolly.chromeApps.chromeAppsStrings.`it-IT` = "it-IT".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`it-IT`]
    
    inline def ja: typingsJapgolly.chromeApps.chromeAppsStrings.ja = "ja".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ja]
    
    inline def jv: typingsJapgolly.chromeApps.chromeAppsStrings.jv = "jv".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.jv]
    
    inline def ka: typingsJapgolly.chromeApps.chromeAppsStrings.ka = "ka".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ka]
    
    inline def kk: typingsJapgolly.chromeApps.chromeAppsStrings.kk = "kk".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.kk]
    
    inline def km: typingsJapgolly.chromeApps.chromeAppsStrings.km = "km".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.km]
    
    inline def kn: typingsJapgolly.chromeApps.chromeAppsStrings.kn = "kn".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.kn]
    
    inline def ko: typingsJapgolly.chromeApps.chromeAppsStrings.ko = "ko".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ko]
    
    inline def ku: typingsJapgolly.chromeApps.chromeAppsStrings.ku = "ku".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ku]
    
    inline def ky: typingsJapgolly.chromeApps.chromeAppsStrings.ky = "ky".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ky]
    
    inline def la: typingsJapgolly.chromeApps.chromeAppsStrings.la = "la".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.la]
    
    inline def lb: typingsJapgolly.chromeApps.chromeAppsStrings.lb = "lb".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.lb]
    
    inline def ln: typingsJapgolly.chromeApps.chromeAppsStrings.ln = "ln".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ln]
    
    inline def lo: typingsJapgolly.chromeApps.chromeAppsStrings.lo = "lo".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.lo]
    
    inline def lt: typingsJapgolly.chromeApps.chromeAppsStrings.lt = "lt".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.lt]
    
    inline def lv: typingsJapgolly.chromeApps.chromeAppsStrings.lv = "lv".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.lv]
    
    inline def mg: typingsJapgolly.chromeApps.chromeAppsStrings.mg = "mg".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.mg]
    
    inline def mi: typingsJapgolly.chromeApps.chromeAppsStrings.mi = "mi".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.mi]
    
    inline def mk: typingsJapgolly.chromeApps.chromeAppsStrings.mk = "mk".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.mk]
    
    inline def ml: typingsJapgolly.chromeApps.chromeAppsStrings.ml = "ml".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ml]
    
    inline def mn: typingsJapgolly.chromeApps.chromeAppsStrings.mn = "mn".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.mn]
    
    inline def mo: typingsJapgolly.chromeApps.chromeAppsStrings.mo = "mo".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.mo]
    
    inline def mr: typingsJapgolly.chromeApps.chromeAppsStrings.mr = "mr".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.mr]
    
    inline def ms: typingsJapgolly.chromeApps.chromeAppsStrings.ms = "ms".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ms]
    
    inline def mt: typingsJapgolly.chromeApps.chromeAppsStrings.mt = "mt".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.mt]
    
    inline def my: typingsJapgolly.chromeApps.chromeAppsStrings.my = "my".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.my]
    
    inline def nb: typingsJapgolly.chromeApps.chromeAppsStrings.nb = "nb".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.nb]
    
    inline def ne: typingsJapgolly.chromeApps.chromeAppsStrings.ne = "ne".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ne]
    
    inline def nl: typingsJapgolly.chromeApps.chromeAppsStrings.nl = "nl".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.nl]
    
    inline def nn: typingsJapgolly.chromeApps.chromeAppsStrings.nn = "nn".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.nn]
    
    inline def no: typingsJapgolly.chromeApps.chromeAppsStrings.no = "no".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.no]
    
    inline def ny: typingsJapgolly.chromeApps.chromeAppsStrings.ny = "ny".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ny]
    
    inline def oc: typingsJapgolly.chromeApps.chromeAppsStrings.oc = "oc".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.oc]
    
    inline def om: typingsJapgolly.chromeApps.chromeAppsStrings.om = "om".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.om]
    
    inline def or: typingsJapgolly.chromeApps.chromeAppsStrings.or = "or".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.or]
    
    inline def pa: typingsJapgolly.chromeApps.chromeAppsStrings.pa = "pa".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.pa]
    
    inline def pl: typingsJapgolly.chromeApps.chromeAppsStrings.pl = "pl".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.pl]
    
    inline def ps: typingsJapgolly.chromeApps.chromeAppsStrings.ps = "ps".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ps]
    
    inline def pt: typingsJapgolly.chromeApps.chromeAppsStrings.pt = "pt".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.pt]
    
    inline def `pt-BR`: typingsJapgolly.chromeApps.chromeAppsStrings.`pt-BR` = "pt-BR".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`pt-BR`]
    
    inline def `pt-PT`: typingsJapgolly.chromeApps.chromeAppsStrings.`pt-PT` = "pt-PT".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`pt-PT`]
    
    inline def qu: typingsJapgolly.chromeApps.chromeAppsStrings.qu = "qu".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.qu]
    
    inline def rm: typingsJapgolly.chromeApps.chromeAppsStrings.rm = "rm".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.rm]
    
    inline def ro: typingsJapgolly.chromeApps.chromeAppsStrings.ro = "ro".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ro]
    
    inline def ru: typingsJapgolly.chromeApps.chromeAppsStrings.ru = "ru".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ru]
    
    inline def sd: typingsJapgolly.chromeApps.chromeAppsStrings.sd = "sd".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.sd]
    
    inline def sh: typingsJapgolly.chromeApps.chromeAppsStrings.sh = "sh".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.sh]
    
    inline def si: typingsJapgolly.chromeApps.chromeAppsStrings.si = "si".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.si]
    
    inline def sk: typingsJapgolly.chromeApps.chromeAppsStrings.sk = "sk".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.sk]
    
    inline def sl: typingsJapgolly.chromeApps.chromeAppsStrings.sl = "sl".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.sl]
    
    inline def sm: typingsJapgolly.chromeApps.chromeAppsStrings.sm = "sm".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.sm]
    
    inline def sn: typingsJapgolly.chromeApps.chromeAppsStrings.sn = "sn".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.sn]
    
    inline def so: typingsJapgolly.chromeApps.chromeAppsStrings.so = "so".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.so]
    
    inline def sq: typingsJapgolly.chromeApps.chromeAppsStrings.sq = "sq".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.sq]
    
    inline def sr: typingsJapgolly.chromeApps.chromeAppsStrings.sr = "sr".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.sr]
    
    inline def st: typingsJapgolly.chromeApps.chromeAppsStrings.st = "st".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.st]
    
    inline def su: typingsJapgolly.chromeApps.chromeAppsStrings.su = "su".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.su]
    
    inline def sv: typingsJapgolly.chromeApps.chromeAppsStrings.sv = "sv".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.sv]
    
    inline def sw: typingsJapgolly.chromeApps.chromeAppsStrings.sw = "sw".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.sw]
    
    inline def ta: typingsJapgolly.chromeApps.chromeAppsStrings.ta = "ta".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ta]
    
    inline def te: typingsJapgolly.chromeApps.chromeAppsStrings.te = "te".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.te]
    
    inline def tg: typingsJapgolly.chromeApps.chromeAppsStrings.tg = "tg".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.tg]
    
    inline def th: typingsJapgolly.chromeApps.chromeAppsStrings.th = "th".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.th]
    
    inline def ti: typingsJapgolly.chromeApps.chromeAppsStrings.ti = "ti".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ti]
    
    inline def tk: typingsJapgolly.chromeApps.chromeAppsStrings.tk = "tk".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.tk]
    
    inline def to: typingsJapgolly.chromeApps.chromeAppsStrings.to = "to".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.to]
    
    inline def tr: typingsJapgolly.chromeApps.chromeAppsStrings.tr = "tr".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.tr]
    
    inline def tt: typingsJapgolly.chromeApps.chromeAppsStrings.tt = "tt".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.tt]
    
    inline def tw: typingsJapgolly.chromeApps.chromeAppsStrings.tw = "tw".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.tw]
    
    inline def ug: typingsJapgolly.chromeApps.chromeAppsStrings.ug = "ug".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ug]
    
    inline def uk: typingsJapgolly.chromeApps.chromeAppsStrings.uk = "uk".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.uk]
    
    inline def ur: typingsJapgolly.chromeApps.chromeAppsStrings.ur = "ur".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.ur]
    
    inline def uz: typingsJapgolly.chromeApps.chromeAppsStrings.uz = "uz".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.uz]
    
    inline def vi: typingsJapgolly.chromeApps.chromeAppsStrings.vi = "vi".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.vi]
    
    inline def wa: typingsJapgolly.chromeApps.chromeAppsStrings.wa = "wa".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.wa]
    
    inline def xh: typingsJapgolly.chromeApps.chromeAppsStrings.xh = "xh".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.xh]
    
    inline def yi: typingsJapgolly.chromeApps.chromeAppsStrings.yi = "yi".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.yi]
    
    inline def yo: typingsJapgolly.chromeApps.chromeAppsStrings.yo = "yo".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.yo]
    
    inline def zh: typingsJapgolly.chromeApps.chromeAppsStrings.zh = "zh".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.zh]
    
    inline def `zh-CN`: typingsJapgolly.chromeApps.chromeAppsStrings.`zh-CN` = "zh-CN".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`zh-CN`]
    
    inline def `zh-HK`: typingsJapgolly.chromeApps.chromeAppsStrings.`zh-HK` = "zh-HK".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`zh-HK`]
    
    inline def `zh-TW`: typingsJapgolly.chromeApps.chromeAppsStrings.`zh-TW` = "zh-TW".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`zh-TW`]
    
    inline def zh_hans_cn: typingsJapgolly.chromeApps.chromeAppsStrings.zh_hans_cn = "zh_hans_cn".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.zh_hans_cn]
    
    inline def zh_hans_sg: typingsJapgolly.chromeApps.chromeAppsStrings.zh_hans_sg = "zh_hans_sg".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.zh_hans_sg]
    
    inline def zh_hant_hk: typingsJapgolly.chromeApps.chromeAppsStrings.zh_hant_hk = "zh_hant_hk".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.zh_hant_hk]
    
    inline def zh_hant_mo: typingsJapgolly.chromeApps.chromeAppsStrings.zh_hant_mo = "zh_hant_mo".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.zh_hant_mo]
    
    inline def zh_hant_tw: typingsJapgolly.chromeApps.chromeAppsStrings.zh_hant_tw = "zh_hant_tw".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.zh_hant_tw]
    
    inline def zu: typingsJapgolly.chromeApps.chromeAppsStrings.zu = "zu".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.zu]
  }
}
