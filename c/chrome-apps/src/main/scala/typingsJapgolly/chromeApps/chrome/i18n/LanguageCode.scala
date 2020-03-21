package typingsJapgolly.chromeApps.chrome.i18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait LanguageCode extends js.Object

object LanguageCode {
  @scala.inline
  def af: typingsJapgolly.chromeApps.chromeAppsStrings.af = this.cast("af")
  @scala.inline
  def am: typingsJapgolly.chromeApps.chromeAppsStrings.am = this.cast("am")
  @scala.inline
  def an: typingsJapgolly.chromeApps.chromeAppsStrings.an = this.cast("an")
  @scala.inline
  def ar: typingsJapgolly.chromeApps.chromeAppsStrings.ar = this.cast("ar")
  @scala.inline
  def ar_001: typingsJapgolly.chromeApps.chromeAppsStrings.ar_001 = this.cast("ar_001")
  @scala.inline
  def ast: typingsJapgolly.chromeApps.chromeAppsStrings.ast = this.cast("ast")
  @scala.inline
  def az: typingsJapgolly.chromeApps.chromeAppsStrings.az = this.cast("az")
  @scala.inline
  def be: typingsJapgolly.chromeApps.chromeAppsStrings.be = this.cast("be")
  @scala.inline
  def bg: typingsJapgolly.chromeApps.chromeAppsStrings.bg = this.cast("bg")
  @scala.inline
  def bh: typingsJapgolly.chromeApps.chromeAppsStrings.bh = this.cast("bh")
  @scala.inline
  def bn: typingsJapgolly.chromeApps.chromeAppsStrings.bn = this.cast("bn")
  @scala.inline
  def br: typingsJapgolly.chromeApps.chromeAppsStrings.br = this.cast("br")
  @scala.inline
  def bs: typingsJapgolly.chromeApps.chromeAppsStrings.bs = this.cast("bs")
  @scala.inline
  def ca: typingsJapgolly.chromeApps.chromeAppsStrings.ca = this.cast("ca")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ceb: typingsJapgolly.chromeApps.chromeAppsStrings.ceb = this.cast("ceb")
  @scala.inline
  def ckb: typingsJapgolly.chromeApps.chromeAppsStrings.ckb = this.cast("ckb")
  @scala.inline
  def co: typingsJapgolly.chromeApps.chromeAppsStrings.co = this.cast("co")
  @scala.inline
  def cs: typingsJapgolly.chromeApps.chromeAppsStrings.cs = this.cast("cs")
  @scala.inline
  def cy: typingsJapgolly.chromeApps.chromeAppsStrings.cy = this.cast("cy")
  @scala.inline
  def da: typingsJapgolly.chromeApps.chromeAppsStrings.da = this.cast("da")
  @scala.inline
  def de: typingsJapgolly.chromeApps.chromeAppsStrings.de = this.cast("de")
  @scala.inline
  def `de-AT`: typingsJapgolly.chromeApps.chromeAppsStrings.`de-AT` = this.cast("de-AT")
  @scala.inline
  def `de-CH`: typingsJapgolly.chromeApps.chromeAppsStrings.`de-CH` = this.cast("de-CH")
  @scala.inline
  def `de-DE`: typingsJapgolly.chromeApps.chromeAppsStrings.`de-DE` = this.cast("de-DE")
  @scala.inline
  def `de-LI`: typingsJapgolly.chromeApps.chromeAppsStrings.`de-LI` = this.cast("de-LI")
  @scala.inline
  def el: typingsJapgolly.chromeApps.chromeAppsStrings.el = this.cast("el")
  @scala.inline
  def en: typingsJapgolly.chromeApps.chromeAppsStrings.en = this.cast("en")
  @scala.inline
  def `en-AU`: typingsJapgolly.chromeApps.chromeAppsStrings.`en-AU` = this.cast("en-AU")
  @scala.inline
  def `en-CA`: typingsJapgolly.chromeApps.chromeAppsStrings.`en-CA` = this.cast("en-CA")
  @scala.inline
  def `en-GB`: typingsJapgolly.chromeApps.chromeAppsStrings.`en-GB` = this.cast("en-GB")
  @scala.inline
  def `en-IN`: typingsJapgolly.chromeApps.chromeAppsStrings.`en-IN` = this.cast("en-IN")
  @scala.inline
  def `en-NZ`: typingsJapgolly.chromeApps.chromeAppsStrings.`en-NZ` = this.cast("en-NZ")
  @scala.inline
  def `en-US`: typingsJapgolly.chromeApps.chromeAppsStrings.`en-US` = this.cast("en-US")
  @scala.inline
  def `en-ZA`: typingsJapgolly.chromeApps.chromeAppsStrings.`en-ZA` = this.cast("en-ZA")
  @scala.inline
  def en_001: typingsJapgolly.chromeApps.chromeAppsStrings.en_001 = this.cast("en_001")
  @scala.inline
  def en_150: typingsJapgolly.chromeApps.chromeAppsStrings.en_150 = this.cast("en_150")
  @scala.inline
  def eo: typingsJapgolly.chromeApps.chromeAppsStrings.eo = this.cast("eo")
  @scala.inline
  def es: typingsJapgolly.chromeApps.chromeAppsStrings.es = this.cast("es")
  @scala.inline
  def `es-419`: typingsJapgolly.chromeApps.chromeAppsStrings.`es-419` = this.cast("es-419")
  @scala.inline
  def `es-AR`: typingsJapgolly.chromeApps.chromeAppsStrings.`es-AR` = this.cast("es-AR")
  @scala.inline
  def `es-CL`: typingsJapgolly.chromeApps.chromeAppsStrings.`es-CL` = this.cast("es-CL")
  @scala.inline
  def `es-CO`: typingsJapgolly.chromeApps.chromeAppsStrings.`es-CO` = this.cast("es-CO")
  @scala.inline
  def `es-CR`: typingsJapgolly.chromeApps.chromeAppsStrings.`es-CR` = this.cast("es-CR")
  @scala.inline
  def `es-ES`: typingsJapgolly.chromeApps.chromeAppsStrings.`es-ES` = this.cast("es-ES")
  @scala.inline
  def `es-HN`: typingsJapgolly.chromeApps.chromeAppsStrings.`es-HN` = this.cast("es-HN")
  @scala.inline
  def `es-MX`: typingsJapgolly.chromeApps.chromeAppsStrings.`es-MX` = this.cast("es-MX")
  @scala.inline
  def `es-PE`: typingsJapgolly.chromeApps.chromeAppsStrings.`es-PE` = this.cast("es-PE")
  @scala.inline
  def `es-US`: typingsJapgolly.chromeApps.chromeAppsStrings.`es-US` = this.cast("es-US")
  @scala.inline
  def `es-UY`: typingsJapgolly.chromeApps.chromeAppsStrings.`es-UY` = this.cast("es-UY")
  @scala.inline
  def `es-VE`: typingsJapgolly.chromeApps.chromeAppsStrings.`es-VE` = this.cast("es-VE")
  @scala.inline
  def et: typingsJapgolly.chromeApps.chromeAppsStrings.et = this.cast("et")
  @scala.inline
  def eu: typingsJapgolly.chromeApps.chromeAppsStrings.eu = this.cast("eu")
  @scala.inline
  def fa: typingsJapgolly.chromeApps.chromeAppsStrings.fa = this.cast("fa")
  @scala.inline
  def fi: typingsJapgolly.chromeApps.chromeAppsStrings.fi = this.cast("fi")
  @scala.inline
  def fil: typingsJapgolly.chromeApps.chromeAppsStrings.fil = this.cast("fil")
  @scala.inline
  def fo: typingsJapgolly.chromeApps.chromeAppsStrings.fo = this.cast("fo")
  @scala.inline
  def fr: typingsJapgolly.chromeApps.chromeAppsStrings.fr = this.cast("fr")
  @scala.inline
  def `fr-CA`: typingsJapgolly.chromeApps.chromeAppsStrings.`fr-CA` = this.cast("fr-CA")
  @scala.inline
  def `fr-CH`: typingsJapgolly.chromeApps.chromeAppsStrings.`fr-CH` = this.cast("fr-CH")
  @scala.inline
  def `fr-FR`: typingsJapgolly.chromeApps.chromeAppsStrings.`fr-FR` = this.cast("fr-FR")
  @scala.inline
  def fy: typingsJapgolly.chromeApps.chromeAppsStrings.fy = this.cast("fy")
  @scala.inline
  def ga: typingsJapgolly.chromeApps.chromeAppsStrings.ga = this.cast("ga")
  @scala.inline
  def gd: typingsJapgolly.chromeApps.chromeAppsStrings.gd = this.cast("gd")
  @scala.inline
  def gl: typingsJapgolly.chromeApps.chromeAppsStrings.gl = this.cast("gl")
  @scala.inline
  def gn: typingsJapgolly.chromeApps.chromeAppsStrings.gn = this.cast("gn")
  @scala.inline
  def gu: typingsJapgolly.chromeApps.chromeAppsStrings.gu = this.cast("gu")
  @scala.inline
  def ha: typingsJapgolly.chromeApps.chromeAppsStrings.ha = this.cast("ha")
  @scala.inline
  def haw: typingsJapgolly.chromeApps.chromeAppsStrings.haw = this.cast("haw")
  @scala.inline
  def he: typingsJapgolly.chromeApps.chromeAppsStrings.he = this.cast("he")
  @scala.inline
  def hi: typingsJapgolly.chromeApps.chromeAppsStrings.hi = this.cast("hi")
  @scala.inline
  def hmn: typingsJapgolly.chromeApps.chromeAppsStrings.hmn = this.cast("hmn")
  @scala.inline
  def hr: typingsJapgolly.chromeApps.chromeAppsStrings.hr = this.cast("hr")
  @scala.inline
  def ht: typingsJapgolly.chromeApps.chromeAppsStrings.ht = this.cast("ht")
  @scala.inline
  def hu: typingsJapgolly.chromeApps.chromeAppsStrings.hu = this.cast("hu")
  @scala.inline
  def hy: typingsJapgolly.chromeApps.chromeAppsStrings.hy = this.cast("hy")
  @scala.inline
  def ia: typingsJapgolly.chromeApps.chromeAppsStrings.ia = this.cast("ia")
  @scala.inline
  def id: typingsJapgolly.chromeApps.chromeAppsStrings.id = this.cast("id")
  @scala.inline
  def ig: typingsJapgolly.chromeApps.chromeAppsStrings.ig = this.cast("ig")
  @scala.inline
  def is: typingsJapgolly.chromeApps.chromeAppsStrings.is = this.cast("is")
  @scala.inline
  def it: typingsJapgolly.chromeApps.chromeAppsStrings.it = this.cast("it")
  @scala.inline
  def `it-CH`: typingsJapgolly.chromeApps.chromeAppsStrings.`it-CH` = this.cast("it-CH")
  @scala.inline
  def `it-IT`: typingsJapgolly.chromeApps.chromeAppsStrings.`it-IT` = this.cast("it-IT")
  @scala.inline
  def ja: typingsJapgolly.chromeApps.chromeAppsStrings.ja = this.cast("ja")
  @scala.inline
  def jv: typingsJapgolly.chromeApps.chromeAppsStrings.jv = this.cast("jv")
  @scala.inline
  def ka: typingsJapgolly.chromeApps.chromeAppsStrings.ka = this.cast("ka")
  @scala.inline
  def kk: typingsJapgolly.chromeApps.chromeAppsStrings.kk = this.cast("kk")
  @scala.inline
  def km: typingsJapgolly.chromeApps.chromeAppsStrings.km = this.cast("km")
  @scala.inline
  def kn: typingsJapgolly.chromeApps.chromeAppsStrings.kn = this.cast("kn")
  @scala.inline
  def ko: typingsJapgolly.chromeApps.chromeAppsStrings.ko = this.cast("ko")
  @scala.inline
  def ku: typingsJapgolly.chromeApps.chromeAppsStrings.ku = this.cast("ku")
  @scala.inline
  def ky: typingsJapgolly.chromeApps.chromeAppsStrings.ky = this.cast("ky")
  @scala.inline
  def la: typingsJapgolly.chromeApps.chromeAppsStrings.la = this.cast("la")
  @scala.inline
  def lb: typingsJapgolly.chromeApps.chromeAppsStrings.lb = this.cast("lb")
  @scala.inline
  def ln: typingsJapgolly.chromeApps.chromeAppsStrings.ln = this.cast("ln")
  @scala.inline
  def lo: typingsJapgolly.chromeApps.chromeAppsStrings.lo = this.cast("lo")
  @scala.inline
  def lt: typingsJapgolly.chromeApps.chromeAppsStrings.lt = this.cast("lt")
  @scala.inline
  def lv: typingsJapgolly.chromeApps.chromeAppsStrings.lv = this.cast("lv")
  @scala.inline
  def mg: typingsJapgolly.chromeApps.chromeAppsStrings.mg = this.cast("mg")
  @scala.inline
  def mi: typingsJapgolly.chromeApps.chromeAppsStrings.mi = this.cast("mi")
  @scala.inline
  def mk: typingsJapgolly.chromeApps.chromeAppsStrings.mk = this.cast("mk")
  @scala.inline
  def ml: typingsJapgolly.chromeApps.chromeAppsStrings.ml = this.cast("ml")
  @scala.inline
  def mn: typingsJapgolly.chromeApps.chromeAppsStrings.mn = this.cast("mn")
  @scala.inline
  def mo: typingsJapgolly.chromeApps.chromeAppsStrings.mo = this.cast("mo")
  @scala.inline
  def mr: typingsJapgolly.chromeApps.chromeAppsStrings.mr = this.cast("mr")
  @scala.inline
  def ms: typingsJapgolly.chromeApps.chromeAppsStrings.ms = this.cast("ms")
  @scala.inline
  def mt: typingsJapgolly.chromeApps.chromeAppsStrings.mt = this.cast("mt")
  @scala.inline
  def my: typingsJapgolly.chromeApps.chromeAppsStrings.my = this.cast("my")
  @scala.inline
  def nb: typingsJapgolly.chromeApps.chromeAppsStrings.nb = this.cast("nb")
  @scala.inline
  def ne: typingsJapgolly.chromeApps.chromeAppsStrings.ne = this.cast("ne")
  @scala.inline
  def nl: typingsJapgolly.chromeApps.chromeAppsStrings.nl = this.cast("nl")
  @scala.inline
  def nn: typingsJapgolly.chromeApps.chromeAppsStrings.nn = this.cast("nn")
  @scala.inline
  def no: typingsJapgolly.chromeApps.chromeAppsStrings.no = this.cast("no")
  @scala.inline
  def ny: typingsJapgolly.chromeApps.chromeAppsStrings.ny = this.cast("ny")
  @scala.inline
  def oc: typingsJapgolly.chromeApps.chromeAppsStrings.oc = this.cast("oc")
  @scala.inline
  def om: typingsJapgolly.chromeApps.chromeAppsStrings.om = this.cast("om")
  @scala.inline
  def or: typingsJapgolly.chromeApps.chromeAppsStrings.or = this.cast("or")
  @scala.inline
  def pa: typingsJapgolly.chromeApps.chromeAppsStrings.pa = this.cast("pa")
  @scala.inline
  def pl: typingsJapgolly.chromeApps.chromeAppsStrings.pl = this.cast("pl")
  @scala.inline
  def ps: typingsJapgolly.chromeApps.chromeAppsStrings.ps = this.cast("ps")
  @scala.inline
  def pt: typingsJapgolly.chromeApps.chromeAppsStrings.pt = this.cast("pt")
  @scala.inline
  def `pt-BR`: typingsJapgolly.chromeApps.chromeAppsStrings.`pt-BR` = this.cast("pt-BR")
  @scala.inline
  def `pt-PT`: typingsJapgolly.chromeApps.chromeAppsStrings.`pt-PT` = this.cast("pt-PT")
  @scala.inline
  def qu: typingsJapgolly.chromeApps.chromeAppsStrings.qu = this.cast("qu")
  @scala.inline
  def rm: typingsJapgolly.chromeApps.chromeAppsStrings.rm = this.cast("rm")
  @scala.inline
  def ro: typingsJapgolly.chromeApps.chromeAppsStrings.ro = this.cast("ro")
  @scala.inline
  def ru: typingsJapgolly.chromeApps.chromeAppsStrings.ru = this.cast("ru")
  @scala.inline
  def sd: typingsJapgolly.chromeApps.chromeAppsStrings.sd = this.cast("sd")
  @scala.inline
  def sh: typingsJapgolly.chromeApps.chromeAppsStrings.sh = this.cast("sh")
  @scala.inline
  def si: typingsJapgolly.chromeApps.chromeAppsStrings.si = this.cast("si")
  @scala.inline
  def sk: typingsJapgolly.chromeApps.chromeAppsStrings.sk = this.cast("sk")
  @scala.inline
  def sl: typingsJapgolly.chromeApps.chromeAppsStrings.sl = this.cast("sl")
  @scala.inline
  def sm: typingsJapgolly.chromeApps.chromeAppsStrings.sm = this.cast("sm")
  @scala.inline
  def sn: typingsJapgolly.chromeApps.chromeAppsStrings.sn = this.cast("sn")
  @scala.inline
  def so: typingsJapgolly.chromeApps.chromeAppsStrings.so = this.cast("so")
  @scala.inline
  def sq: typingsJapgolly.chromeApps.chromeAppsStrings.sq = this.cast("sq")
  @scala.inline
  def sr: typingsJapgolly.chromeApps.chromeAppsStrings.sr = this.cast("sr")
  @scala.inline
  def st: typingsJapgolly.chromeApps.chromeAppsStrings.st = this.cast("st")
  @scala.inline
  def su: typingsJapgolly.chromeApps.chromeAppsStrings.su = this.cast("su")
  @scala.inline
  def sv: typingsJapgolly.chromeApps.chromeAppsStrings.sv = this.cast("sv")
  @scala.inline
  def sw: typingsJapgolly.chromeApps.chromeAppsStrings.sw = this.cast("sw")
  @scala.inline
  def ta: typingsJapgolly.chromeApps.chromeAppsStrings.ta = this.cast("ta")
  @scala.inline
  def te: typingsJapgolly.chromeApps.chromeAppsStrings.te = this.cast("te")
  @scala.inline
  def tg: typingsJapgolly.chromeApps.chromeAppsStrings.tg = this.cast("tg")
  @scala.inline
  def th: typingsJapgolly.chromeApps.chromeAppsStrings.th = this.cast("th")
  @scala.inline
  def ti: typingsJapgolly.chromeApps.chromeAppsStrings.ti = this.cast("ti")
  @scala.inline
  def tk: typingsJapgolly.chromeApps.chromeAppsStrings.tk = this.cast("tk")
  @scala.inline
  def to: typingsJapgolly.chromeApps.chromeAppsStrings.to = this.cast("to")
  @scala.inline
  def tr: typingsJapgolly.chromeApps.chromeAppsStrings.tr = this.cast("tr")
  @scala.inline
  def tt: typingsJapgolly.chromeApps.chromeAppsStrings.tt = this.cast("tt")
  @scala.inline
  def tw: typingsJapgolly.chromeApps.chromeAppsStrings.tw = this.cast("tw")
  @scala.inline
  def ug: typingsJapgolly.chromeApps.chromeAppsStrings.ug = this.cast("ug")
  @scala.inline
  def uk: typingsJapgolly.chromeApps.chromeAppsStrings.uk = this.cast("uk")
  @scala.inline
  def und: typingsJapgolly.chromeApps.chromeAppsStrings.und = this.cast("und")
  @scala.inline
  def ur: typingsJapgolly.chromeApps.chromeAppsStrings.ur = this.cast("ur")
  @scala.inline
  def uz: typingsJapgolly.chromeApps.chromeAppsStrings.uz = this.cast("uz")
  @scala.inline
  def vi: typingsJapgolly.chromeApps.chromeAppsStrings.vi = this.cast("vi")
  @scala.inline
  def wa: typingsJapgolly.chromeApps.chromeAppsStrings.wa = this.cast("wa")
  @scala.inline
  def xh: typingsJapgolly.chromeApps.chromeAppsStrings.xh = this.cast("xh")
  @scala.inline
  def yi: typingsJapgolly.chromeApps.chromeAppsStrings.yi = this.cast("yi")
  @scala.inline
  def yo: typingsJapgolly.chromeApps.chromeAppsStrings.yo = this.cast("yo")
  @scala.inline
  def zh: typingsJapgolly.chromeApps.chromeAppsStrings.zh = this.cast("zh")
  @scala.inline
  def `zh-CN`: typingsJapgolly.chromeApps.chromeAppsStrings.`zh-CN` = this.cast("zh-CN")
  @scala.inline
  def `zh-HK`: typingsJapgolly.chromeApps.chromeAppsStrings.`zh-HK` = this.cast("zh-HK")
  @scala.inline
  def `zh-TW`: typingsJapgolly.chromeApps.chromeAppsStrings.`zh-TW` = this.cast("zh-TW")
  @scala.inline
  def zh_hans_cn: typingsJapgolly.chromeApps.chromeAppsStrings.zh_hans_cn = this.cast("zh_hans_cn")
  @scala.inline
  def zh_hans_sg: typingsJapgolly.chromeApps.chromeAppsStrings.zh_hans_sg = this.cast("zh_hans_sg")
  @scala.inline
  def zh_hant_hk: typingsJapgolly.chromeApps.chromeAppsStrings.zh_hant_hk = this.cast("zh_hant_hk")
  @scala.inline
  def zh_hant_mo: typingsJapgolly.chromeApps.chromeAppsStrings.zh_hant_mo = this.cast("zh_hant_mo")
  @scala.inline
  def zh_hant_tw: typingsJapgolly.chromeApps.chromeAppsStrings.zh_hant_tw = this.cast("zh_hant_tw")
  @scala.inline
  def zu: typingsJapgolly.chromeApps.chromeAppsStrings.zu = this.cast("zu")
}

