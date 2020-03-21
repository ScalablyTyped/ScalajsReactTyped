package typingsJapgolly.pdfkit.PDFKit.Mixins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Text option opentype features as listed at https://docs.microsoft.com/en-us/typography/opentype/spec/featurelist
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.pdfkit.pdfkitStrings.aalt
  - typingsJapgolly.pdfkit.pdfkitStrings.abvf
  - typingsJapgolly.pdfkit.pdfkitStrings.abvm
  - typingsJapgolly.pdfkit.pdfkitStrings.abvs
  - typingsJapgolly.pdfkit.pdfkitStrings.afrc
  - typingsJapgolly.pdfkit.pdfkitStrings.akhn
  - typingsJapgolly.pdfkit.pdfkitStrings.blwf
  - typingsJapgolly.pdfkit.pdfkitStrings.blwm
  - typingsJapgolly.pdfkit.pdfkitStrings.blws
  - typingsJapgolly.pdfkit.pdfkitStrings.calt
  - typingsJapgolly.pdfkit.pdfkitStrings.`case`
  - typingsJapgolly.pdfkit.pdfkitStrings.cfar
  - typingsJapgolly.pdfkit.pdfkitStrings.cjct
  - typingsJapgolly.pdfkit.pdfkitStrings.clig
  - typingsJapgolly.pdfkit.pdfkitStrings.cpct
  - typingsJapgolly.pdfkit.pdfkitStrings.cpsp
  - typingsJapgolly.pdfkit.pdfkitStrings.cswh
  - typingsJapgolly.pdfkit.pdfkitStrings.curs
  - typingsJapgolly.pdfkit.pdfkitStrings.cv01
  - typingsJapgolly.pdfkit.pdfkitStrings.cv02
  - typingsJapgolly.pdfkit.pdfkitStrings.cv03
  - typingsJapgolly.pdfkit.pdfkitStrings.cv04
  - typingsJapgolly.pdfkit.pdfkitStrings.cv05
  - typingsJapgolly.pdfkit.pdfkitStrings.cv06
  - typingsJapgolly.pdfkit.pdfkitStrings.cv07
  - typingsJapgolly.pdfkit.pdfkitStrings.cv08
  - typingsJapgolly.pdfkit.pdfkitStrings.cv09
  - typingsJapgolly.pdfkit.pdfkitStrings.cv10
  - typingsJapgolly.pdfkit.pdfkitStrings.cv11
  - typingsJapgolly.pdfkit.pdfkitStrings.cv12
  - typingsJapgolly.pdfkit.pdfkitStrings.cv13
  - typingsJapgolly.pdfkit.pdfkitStrings.cv14
  - typingsJapgolly.pdfkit.pdfkitStrings.cv15
  - typingsJapgolly.pdfkit.pdfkitStrings.cv16
  - typingsJapgolly.pdfkit.pdfkitStrings.cv17
  - typingsJapgolly.pdfkit.pdfkitStrings.cv18
  - typingsJapgolly.pdfkit.pdfkitStrings.cv19
  - typingsJapgolly.pdfkit.pdfkitStrings.cv20
  - typingsJapgolly.pdfkit.pdfkitStrings.cv21
  - typingsJapgolly.pdfkit.pdfkitStrings.cv22
  - typingsJapgolly.pdfkit.pdfkitStrings.cv23
  - typingsJapgolly.pdfkit.pdfkitStrings.cv24
  - typingsJapgolly.pdfkit.pdfkitStrings.cv25
  - typingsJapgolly.pdfkit.pdfkitStrings.cv26
  - typingsJapgolly.pdfkit.pdfkitStrings.cv27
  - typingsJapgolly.pdfkit.pdfkitStrings.cv28
  - typingsJapgolly.pdfkit.pdfkitStrings.cv29
  - typingsJapgolly.pdfkit.pdfkitStrings.cv30
  - typingsJapgolly.pdfkit.pdfkitStrings.cv31
  - typingsJapgolly.pdfkit.pdfkitStrings.cv32
  - typingsJapgolly.pdfkit.pdfkitStrings.cv33
  - typingsJapgolly.pdfkit.pdfkitStrings.cv34
  - typingsJapgolly.pdfkit.pdfkitStrings.cv35
  - typingsJapgolly.pdfkit.pdfkitStrings.cv36
  - typingsJapgolly.pdfkit.pdfkitStrings.cv37
  - typingsJapgolly.pdfkit.pdfkitStrings.cv38
  - typingsJapgolly.pdfkit.pdfkitStrings.cv39
  - typingsJapgolly.pdfkit.pdfkitStrings.cv40
  - typingsJapgolly.pdfkit.pdfkitStrings.cv41
  - typingsJapgolly.pdfkit.pdfkitStrings.cv42
  - typingsJapgolly.pdfkit.pdfkitStrings.cv43
  - typingsJapgolly.pdfkit.pdfkitStrings.cv44
  - typingsJapgolly.pdfkit.pdfkitStrings.cv45
  - typingsJapgolly.pdfkit.pdfkitStrings.cv46
  - typingsJapgolly.pdfkit.pdfkitStrings.cv47
  - typingsJapgolly.pdfkit.pdfkitStrings.cv48
  - typingsJapgolly.pdfkit.pdfkitStrings.cv49
  - typingsJapgolly.pdfkit.pdfkitStrings.cv50
  - typingsJapgolly.pdfkit.pdfkitStrings.cv51
  - typingsJapgolly.pdfkit.pdfkitStrings.cv52
  - typingsJapgolly.pdfkit.pdfkitStrings.cv53
  - typingsJapgolly.pdfkit.pdfkitStrings.cv54
  - typingsJapgolly.pdfkit.pdfkitStrings.cv55
  - typingsJapgolly.pdfkit.pdfkitStrings.cv56
  - typingsJapgolly.pdfkit.pdfkitStrings.cv57
  - typingsJapgolly.pdfkit.pdfkitStrings.cv58
  - typingsJapgolly.pdfkit.pdfkitStrings.cv59
  - typingsJapgolly.pdfkit.pdfkitStrings.cv60
  - typingsJapgolly.pdfkit.pdfkitStrings.cv61
  - typingsJapgolly.pdfkit.pdfkitStrings.cv62
  - typingsJapgolly.pdfkit.pdfkitStrings.cv63
  - typingsJapgolly.pdfkit.pdfkitStrings.cv64
  - typingsJapgolly.pdfkit.pdfkitStrings.cv65
  - typingsJapgolly.pdfkit.pdfkitStrings.cv66
  - typingsJapgolly.pdfkit.pdfkitStrings.cv67
  - typingsJapgolly.pdfkit.pdfkitStrings.cv68
  - typingsJapgolly.pdfkit.pdfkitStrings.cv69
  - typingsJapgolly.pdfkit.pdfkitStrings.cv70
  - typingsJapgolly.pdfkit.pdfkitStrings.cv71
  - typingsJapgolly.pdfkit.pdfkitStrings.cv72
  - typingsJapgolly.pdfkit.pdfkitStrings.cv73
  - typingsJapgolly.pdfkit.pdfkitStrings.cv74
  - typingsJapgolly.pdfkit.pdfkitStrings.cv75
  - typingsJapgolly.pdfkit.pdfkitStrings.cv76
  - typingsJapgolly.pdfkit.pdfkitStrings.cv77
  - typingsJapgolly.pdfkit.pdfkitStrings.cv78
  - typingsJapgolly.pdfkit.pdfkitStrings.cv79
  - typingsJapgolly.pdfkit.pdfkitStrings.cv80
  - typingsJapgolly.pdfkit.pdfkitStrings.cv81
  - typingsJapgolly.pdfkit.pdfkitStrings.cv82
  - typingsJapgolly.pdfkit.pdfkitStrings.cv83
  - typingsJapgolly.pdfkit.pdfkitStrings.cv84
  - typingsJapgolly.pdfkit.pdfkitStrings.cv85
  - typingsJapgolly.pdfkit.pdfkitStrings.cv86
  - typingsJapgolly.pdfkit.pdfkitStrings.cv87
  - typingsJapgolly.pdfkit.pdfkitStrings.cv88
  - typingsJapgolly.pdfkit.pdfkitStrings.cv89
  - typingsJapgolly.pdfkit.pdfkitStrings.cv90
  - typingsJapgolly.pdfkit.pdfkitStrings.cv91
  - typingsJapgolly.pdfkit.pdfkitStrings.cv92
  - typingsJapgolly.pdfkit.pdfkitStrings.cv93
  - typingsJapgolly.pdfkit.pdfkitStrings.cv94
  - typingsJapgolly.pdfkit.pdfkitStrings.cv95
  - typingsJapgolly.pdfkit.pdfkitStrings.cv96
  - typingsJapgolly.pdfkit.pdfkitStrings.cv97
  - typingsJapgolly.pdfkit.pdfkitStrings.cv98
  - typingsJapgolly.pdfkit.pdfkitStrings.cv99
  - typingsJapgolly.pdfkit.pdfkitStrings.c2pc
  - typingsJapgolly.pdfkit.pdfkitStrings.c2sc
  - typingsJapgolly.pdfkit.pdfkitStrings.dist
  - typingsJapgolly.pdfkit.pdfkitStrings.ccmp
  - typingsJapgolly.pdfkit.pdfkitStrings.dlig
  - typingsJapgolly.pdfkit.pdfkitStrings.dnom
  - typingsJapgolly.pdfkit.pdfkitStrings.dtls
  - typingsJapgolly.pdfkit.pdfkitStrings.expt
  - typingsJapgolly.pdfkit.pdfkitStrings.falt
  - typingsJapgolly.pdfkit.pdfkitStrings.fin2
  - typingsJapgolly.pdfkit.pdfkitStrings.fin3
  - typingsJapgolly.pdfkit.pdfkitStrings.fina
  - typingsJapgolly.pdfkit.pdfkitStrings.flac
  - typingsJapgolly.pdfkit.pdfkitStrings.frac
  - typingsJapgolly.pdfkit.pdfkitStrings.fwid
  - typingsJapgolly.pdfkit.pdfkitStrings.half
  - typingsJapgolly.pdfkit.pdfkitStrings.haln
  - typingsJapgolly.pdfkit.pdfkitStrings.halt
  - typingsJapgolly.pdfkit.pdfkitStrings.hist
  - typingsJapgolly.pdfkit.pdfkitStrings.hkna
  - typingsJapgolly.pdfkit.pdfkitStrings.hlig
  - typingsJapgolly.pdfkit.pdfkitStrings.hngl
  - typingsJapgolly.pdfkit.pdfkitStrings.hojo
  - typingsJapgolly.pdfkit.pdfkitStrings.hwid
  - typingsJapgolly.pdfkit.pdfkitStrings.init
  - typingsJapgolly.pdfkit.pdfkitStrings.isol
  - typingsJapgolly.pdfkit.pdfkitStrings.ital
  - typingsJapgolly.pdfkit.pdfkitStrings.jalt
  - typingsJapgolly.pdfkit.pdfkitStrings.jp78
  - typingsJapgolly.pdfkit.pdfkitStrings.jp83
  - typingsJapgolly.pdfkit.pdfkitStrings.jp90
  - typingsJapgolly.pdfkit.pdfkitStrings.jp04
  - typingsJapgolly.pdfkit.pdfkitStrings.kern
  - typingsJapgolly.pdfkit.pdfkitStrings.lfbd
  - typingsJapgolly.pdfkit.pdfkitStrings.liga
  - typingsJapgolly.pdfkit.pdfkitStrings.ljmo
  - typingsJapgolly.pdfkit.pdfkitStrings.lnum
  - typingsJapgolly.pdfkit.pdfkitStrings.locl
  - typingsJapgolly.pdfkit.pdfkitStrings.ltra
  - typingsJapgolly.pdfkit.pdfkitStrings.ltrm
  - typingsJapgolly.pdfkit.pdfkitStrings.mark
  - typingsJapgolly.pdfkit.pdfkitStrings.med2
  - typingsJapgolly.pdfkit.pdfkitStrings.medi
  - typingsJapgolly.pdfkit.pdfkitStrings.mgrk
  - typingsJapgolly.pdfkit.pdfkitStrings.mkmk
  - typingsJapgolly.pdfkit.pdfkitStrings.mset
  - typingsJapgolly.pdfkit.pdfkitStrings.nalt
  - typingsJapgolly.pdfkit.pdfkitStrings.nlck
  - typingsJapgolly.pdfkit.pdfkitStrings.nukt
  - typingsJapgolly.pdfkit.pdfkitStrings.numr
  - typingsJapgolly.pdfkit.pdfkitStrings.onum
  - typingsJapgolly.pdfkit.pdfkitStrings.opbd
  - typingsJapgolly.pdfkit.pdfkitStrings.ordn
  - typingsJapgolly.pdfkit.pdfkitStrings.ornm
  - typingsJapgolly.pdfkit.pdfkitStrings.palt
  - typingsJapgolly.pdfkit.pdfkitStrings.pcap
  - typingsJapgolly.pdfkit.pdfkitStrings.pkna
  - typingsJapgolly.pdfkit.pdfkitStrings.pnum
  - typingsJapgolly.pdfkit.pdfkitStrings.pref
  - typingsJapgolly.pdfkit.pdfkitStrings.pres
  - typingsJapgolly.pdfkit.pdfkitStrings.pstf
  - typingsJapgolly.pdfkit.pdfkitStrings.psts
  - typingsJapgolly.pdfkit.pdfkitStrings.pwid
  - typingsJapgolly.pdfkit.pdfkitStrings.qwid
  - typingsJapgolly.pdfkit.pdfkitStrings.rand
  - typingsJapgolly.pdfkit.pdfkitStrings.rclt
  - typingsJapgolly.pdfkit.pdfkitStrings.rkrf
  - typingsJapgolly.pdfkit.pdfkitStrings.rlig
  - typingsJapgolly.pdfkit.pdfkitStrings.rphf
  - typingsJapgolly.pdfkit.pdfkitStrings.rtbd
  - typingsJapgolly.pdfkit.pdfkitStrings.rtla
  - typingsJapgolly.pdfkit.pdfkitStrings.rtlm
  - typingsJapgolly.pdfkit.pdfkitStrings.ruby
  - typingsJapgolly.pdfkit.pdfkitStrings.rvrn
  - typingsJapgolly.pdfkit.pdfkitStrings.salt
  - typingsJapgolly.pdfkit.pdfkitStrings.sinf
  - typingsJapgolly.pdfkit.pdfkitStrings.size
  - typingsJapgolly.pdfkit.pdfkitStrings.smcp
  - typingsJapgolly.pdfkit.pdfkitStrings.smpl
  - typingsJapgolly.pdfkit.pdfkitStrings.ss01
  - typingsJapgolly.pdfkit.pdfkitStrings.ss02
  - typingsJapgolly.pdfkit.pdfkitStrings.ss03
  - typingsJapgolly.pdfkit.pdfkitStrings.ss04
  - typingsJapgolly.pdfkit.pdfkitStrings.ss05
  - typingsJapgolly.pdfkit.pdfkitStrings.ss06
  - typingsJapgolly.pdfkit.pdfkitStrings.ss07
  - typingsJapgolly.pdfkit.pdfkitStrings.ss08
  - typingsJapgolly.pdfkit.pdfkitStrings.ss09
  - typingsJapgolly.pdfkit.pdfkitStrings.ss10
  - typingsJapgolly.pdfkit.pdfkitStrings.ss11
  - typingsJapgolly.pdfkit.pdfkitStrings.ss12
  - typingsJapgolly.pdfkit.pdfkitStrings.ss13
  - typingsJapgolly.pdfkit.pdfkitStrings.ss14
  - typingsJapgolly.pdfkit.pdfkitStrings.ss15
  - typingsJapgolly.pdfkit.pdfkitStrings.ss16
  - typingsJapgolly.pdfkit.pdfkitStrings.ss17
  - typingsJapgolly.pdfkit.pdfkitStrings.ss18
  - typingsJapgolly.pdfkit.pdfkitStrings.ss19
  - typingsJapgolly.pdfkit.pdfkitStrings.ss20
  - typingsJapgolly.pdfkit.pdfkitStrings.ssty
  - typingsJapgolly.pdfkit.pdfkitStrings.stch
  - typingsJapgolly.pdfkit.pdfkitStrings.subs
  - typingsJapgolly.pdfkit.pdfkitStrings.sups
  - typingsJapgolly.pdfkit.pdfkitStrings.swsh
  - typingsJapgolly.pdfkit.pdfkitStrings.titl
  - typingsJapgolly.pdfkit.pdfkitStrings.tjmo
  - typingsJapgolly.pdfkit.pdfkitStrings.tnam
  - typingsJapgolly.pdfkit.pdfkitStrings.tnum
  - typingsJapgolly.pdfkit.pdfkitStrings.trad
  - typingsJapgolly.pdfkit.pdfkitStrings.twid
  - typingsJapgolly.pdfkit.pdfkitStrings.unic
  - typingsJapgolly.pdfkit.pdfkitStrings.valt
  - typingsJapgolly.pdfkit.pdfkitStrings.vatu
  - typingsJapgolly.pdfkit.pdfkitStrings.vert
  - typingsJapgolly.pdfkit.pdfkitStrings.vhal
  - typingsJapgolly.pdfkit.pdfkitStrings.vjmo
  - typingsJapgolly.pdfkit.pdfkitStrings.vkna
  - typingsJapgolly.pdfkit.pdfkitStrings.vkrn
  - typingsJapgolly.pdfkit.pdfkitStrings.vpal
  - typingsJapgolly.pdfkit.pdfkitStrings.vrt2
  - typingsJapgolly.pdfkit.pdfkitStrings.vrtr
  - typingsJapgolly.pdfkit.pdfkitStrings.zero
*/
trait OpenTypeFeatures extends js.Object

object OpenTypeFeatures {
  @scala.inline
  def aalt: typingsJapgolly.pdfkit.pdfkitStrings.aalt = this.cast("aalt")
  @scala.inline
  def abvf: typingsJapgolly.pdfkit.pdfkitStrings.abvf = this.cast("abvf")
  @scala.inline
  def abvm: typingsJapgolly.pdfkit.pdfkitStrings.abvm = this.cast("abvm")
  @scala.inline
  def abvs: typingsJapgolly.pdfkit.pdfkitStrings.abvs = this.cast("abvs")
  @scala.inline
  def afrc: typingsJapgolly.pdfkit.pdfkitStrings.afrc = this.cast("afrc")
  @scala.inline
  def akhn: typingsJapgolly.pdfkit.pdfkitStrings.akhn = this.cast("akhn")
  @scala.inline
  def blwf: typingsJapgolly.pdfkit.pdfkitStrings.blwf = this.cast("blwf")
  @scala.inline
  def blwm: typingsJapgolly.pdfkit.pdfkitStrings.blwm = this.cast("blwm")
  @scala.inline
  def blws: typingsJapgolly.pdfkit.pdfkitStrings.blws = this.cast("blws")
  @scala.inline
  def c2pc: typingsJapgolly.pdfkit.pdfkitStrings.c2pc = this.cast("c2pc")
  @scala.inline
  def c2sc: typingsJapgolly.pdfkit.pdfkitStrings.c2sc = this.cast("c2sc")
  @scala.inline
  def calt: typingsJapgolly.pdfkit.pdfkitStrings.calt = this.cast("calt")
  @scala.inline
  def `case`: typingsJapgolly.pdfkit.pdfkitStrings.`case` = this.cast("case")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ccmp: typingsJapgolly.pdfkit.pdfkitStrings.ccmp = this.cast("ccmp")
  @scala.inline
  def cfar: typingsJapgolly.pdfkit.pdfkitStrings.cfar = this.cast("cfar")
  @scala.inline
  def cjct: typingsJapgolly.pdfkit.pdfkitStrings.cjct = this.cast("cjct")
  @scala.inline
  def clig: typingsJapgolly.pdfkit.pdfkitStrings.clig = this.cast("clig")
  @scala.inline
  def cpct: typingsJapgolly.pdfkit.pdfkitStrings.cpct = this.cast("cpct")
  @scala.inline
  def cpsp: typingsJapgolly.pdfkit.pdfkitStrings.cpsp = this.cast("cpsp")
  @scala.inline
  def cswh: typingsJapgolly.pdfkit.pdfkitStrings.cswh = this.cast("cswh")
  @scala.inline
  def curs: typingsJapgolly.pdfkit.pdfkitStrings.curs = this.cast("curs")
  @scala.inline
  def cv01: typingsJapgolly.pdfkit.pdfkitStrings.cv01 = this.cast("cv01")
  @scala.inline
  def cv02: typingsJapgolly.pdfkit.pdfkitStrings.cv02 = this.cast("cv02")
  @scala.inline
  def cv03: typingsJapgolly.pdfkit.pdfkitStrings.cv03 = this.cast("cv03")
  @scala.inline
  def cv04: typingsJapgolly.pdfkit.pdfkitStrings.cv04 = this.cast("cv04")
  @scala.inline
  def cv05: typingsJapgolly.pdfkit.pdfkitStrings.cv05 = this.cast("cv05")
  @scala.inline
  def cv06: typingsJapgolly.pdfkit.pdfkitStrings.cv06 = this.cast("cv06")
  @scala.inline
  def cv07: typingsJapgolly.pdfkit.pdfkitStrings.cv07 = this.cast("cv07")
  @scala.inline
  def cv08: typingsJapgolly.pdfkit.pdfkitStrings.cv08 = this.cast("cv08")
  @scala.inline
  def cv09: typingsJapgolly.pdfkit.pdfkitStrings.cv09 = this.cast("cv09")
  @scala.inline
  def cv10: typingsJapgolly.pdfkit.pdfkitStrings.cv10 = this.cast("cv10")
  @scala.inline
  def cv11: typingsJapgolly.pdfkit.pdfkitStrings.cv11 = this.cast("cv11")
  @scala.inline
  def cv12: typingsJapgolly.pdfkit.pdfkitStrings.cv12 = this.cast("cv12")
  @scala.inline
  def cv13: typingsJapgolly.pdfkit.pdfkitStrings.cv13 = this.cast("cv13")
  @scala.inline
  def cv14: typingsJapgolly.pdfkit.pdfkitStrings.cv14 = this.cast("cv14")
  @scala.inline
  def cv15: typingsJapgolly.pdfkit.pdfkitStrings.cv15 = this.cast("cv15")
  @scala.inline
  def cv16: typingsJapgolly.pdfkit.pdfkitStrings.cv16 = this.cast("cv16")
  @scala.inline
  def cv17: typingsJapgolly.pdfkit.pdfkitStrings.cv17 = this.cast("cv17")
  @scala.inline
  def cv18: typingsJapgolly.pdfkit.pdfkitStrings.cv18 = this.cast("cv18")
  @scala.inline
  def cv19: typingsJapgolly.pdfkit.pdfkitStrings.cv19 = this.cast("cv19")
  @scala.inline
  def cv20: typingsJapgolly.pdfkit.pdfkitStrings.cv20 = this.cast("cv20")
  @scala.inline
  def cv21: typingsJapgolly.pdfkit.pdfkitStrings.cv21 = this.cast("cv21")
  @scala.inline
  def cv22: typingsJapgolly.pdfkit.pdfkitStrings.cv22 = this.cast("cv22")
  @scala.inline
  def cv23: typingsJapgolly.pdfkit.pdfkitStrings.cv23 = this.cast("cv23")
  @scala.inline
  def cv24: typingsJapgolly.pdfkit.pdfkitStrings.cv24 = this.cast("cv24")
  @scala.inline
  def cv25: typingsJapgolly.pdfkit.pdfkitStrings.cv25 = this.cast("cv25")
  @scala.inline
  def cv26: typingsJapgolly.pdfkit.pdfkitStrings.cv26 = this.cast("cv26")
  @scala.inline
  def cv27: typingsJapgolly.pdfkit.pdfkitStrings.cv27 = this.cast("cv27")
  @scala.inline
  def cv28: typingsJapgolly.pdfkit.pdfkitStrings.cv28 = this.cast("cv28")
  @scala.inline
  def cv29: typingsJapgolly.pdfkit.pdfkitStrings.cv29 = this.cast("cv29")
  @scala.inline
  def cv30: typingsJapgolly.pdfkit.pdfkitStrings.cv30 = this.cast("cv30")
  @scala.inline
  def cv31: typingsJapgolly.pdfkit.pdfkitStrings.cv31 = this.cast("cv31")
  @scala.inline
  def cv32: typingsJapgolly.pdfkit.pdfkitStrings.cv32 = this.cast("cv32")
  @scala.inline
  def cv33: typingsJapgolly.pdfkit.pdfkitStrings.cv33 = this.cast("cv33")
  @scala.inline
  def cv34: typingsJapgolly.pdfkit.pdfkitStrings.cv34 = this.cast("cv34")
  @scala.inline
  def cv35: typingsJapgolly.pdfkit.pdfkitStrings.cv35 = this.cast("cv35")
  @scala.inline
  def cv36: typingsJapgolly.pdfkit.pdfkitStrings.cv36 = this.cast("cv36")
  @scala.inline
  def cv37: typingsJapgolly.pdfkit.pdfkitStrings.cv37 = this.cast("cv37")
  @scala.inline
  def cv38: typingsJapgolly.pdfkit.pdfkitStrings.cv38 = this.cast("cv38")
  @scala.inline
  def cv39: typingsJapgolly.pdfkit.pdfkitStrings.cv39 = this.cast("cv39")
  @scala.inline
  def cv40: typingsJapgolly.pdfkit.pdfkitStrings.cv40 = this.cast("cv40")
  @scala.inline
  def cv41: typingsJapgolly.pdfkit.pdfkitStrings.cv41 = this.cast("cv41")
  @scala.inline
  def cv42: typingsJapgolly.pdfkit.pdfkitStrings.cv42 = this.cast("cv42")
  @scala.inline
  def cv43: typingsJapgolly.pdfkit.pdfkitStrings.cv43 = this.cast("cv43")
  @scala.inline
  def cv44: typingsJapgolly.pdfkit.pdfkitStrings.cv44 = this.cast("cv44")
  @scala.inline
  def cv45: typingsJapgolly.pdfkit.pdfkitStrings.cv45 = this.cast("cv45")
  @scala.inline
  def cv46: typingsJapgolly.pdfkit.pdfkitStrings.cv46 = this.cast("cv46")
  @scala.inline
  def cv47: typingsJapgolly.pdfkit.pdfkitStrings.cv47 = this.cast("cv47")
  @scala.inline
  def cv48: typingsJapgolly.pdfkit.pdfkitStrings.cv48 = this.cast("cv48")
  @scala.inline
  def cv49: typingsJapgolly.pdfkit.pdfkitStrings.cv49 = this.cast("cv49")
  @scala.inline
  def cv50: typingsJapgolly.pdfkit.pdfkitStrings.cv50 = this.cast("cv50")
  @scala.inline
  def cv51: typingsJapgolly.pdfkit.pdfkitStrings.cv51 = this.cast("cv51")
  @scala.inline
  def cv52: typingsJapgolly.pdfkit.pdfkitStrings.cv52 = this.cast("cv52")
  @scala.inline
  def cv53: typingsJapgolly.pdfkit.pdfkitStrings.cv53 = this.cast("cv53")
  @scala.inline
  def cv54: typingsJapgolly.pdfkit.pdfkitStrings.cv54 = this.cast("cv54")
  @scala.inline
  def cv55: typingsJapgolly.pdfkit.pdfkitStrings.cv55 = this.cast("cv55")
  @scala.inline
  def cv56: typingsJapgolly.pdfkit.pdfkitStrings.cv56 = this.cast("cv56")
  @scala.inline
  def cv57: typingsJapgolly.pdfkit.pdfkitStrings.cv57 = this.cast("cv57")
  @scala.inline
  def cv58: typingsJapgolly.pdfkit.pdfkitStrings.cv58 = this.cast("cv58")
  @scala.inline
  def cv59: typingsJapgolly.pdfkit.pdfkitStrings.cv59 = this.cast("cv59")
  @scala.inline
  def cv60: typingsJapgolly.pdfkit.pdfkitStrings.cv60 = this.cast("cv60")
  @scala.inline
  def cv61: typingsJapgolly.pdfkit.pdfkitStrings.cv61 = this.cast("cv61")
  @scala.inline
  def cv62: typingsJapgolly.pdfkit.pdfkitStrings.cv62 = this.cast("cv62")
  @scala.inline
  def cv63: typingsJapgolly.pdfkit.pdfkitStrings.cv63 = this.cast("cv63")
  @scala.inline
  def cv64: typingsJapgolly.pdfkit.pdfkitStrings.cv64 = this.cast("cv64")
  @scala.inline
  def cv65: typingsJapgolly.pdfkit.pdfkitStrings.cv65 = this.cast("cv65")
  @scala.inline
  def cv66: typingsJapgolly.pdfkit.pdfkitStrings.cv66 = this.cast("cv66")
  @scala.inline
  def cv67: typingsJapgolly.pdfkit.pdfkitStrings.cv67 = this.cast("cv67")
  @scala.inline
  def cv68: typingsJapgolly.pdfkit.pdfkitStrings.cv68 = this.cast("cv68")
  @scala.inline
  def cv69: typingsJapgolly.pdfkit.pdfkitStrings.cv69 = this.cast("cv69")
  @scala.inline
  def cv70: typingsJapgolly.pdfkit.pdfkitStrings.cv70 = this.cast("cv70")
  @scala.inline
  def cv71: typingsJapgolly.pdfkit.pdfkitStrings.cv71 = this.cast("cv71")
  @scala.inline
  def cv72: typingsJapgolly.pdfkit.pdfkitStrings.cv72 = this.cast("cv72")
  @scala.inline
  def cv73: typingsJapgolly.pdfkit.pdfkitStrings.cv73 = this.cast("cv73")
  @scala.inline
  def cv74: typingsJapgolly.pdfkit.pdfkitStrings.cv74 = this.cast("cv74")
  @scala.inline
  def cv75: typingsJapgolly.pdfkit.pdfkitStrings.cv75 = this.cast("cv75")
  @scala.inline
  def cv76: typingsJapgolly.pdfkit.pdfkitStrings.cv76 = this.cast("cv76")
  @scala.inline
  def cv77: typingsJapgolly.pdfkit.pdfkitStrings.cv77 = this.cast("cv77")
  @scala.inline
  def cv78: typingsJapgolly.pdfkit.pdfkitStrings.cv78 = this.cast("cv78")
  @scala.inline
  def cv79: typingsJapgolly.pdfkit.pdfkitStrings.cv79 = this.cast("cv79")
  @scala.inline
  def cv80: typingsJapgolly.pdfkit.pdfkitStrings.cv80 = this.cast("cv80")
  @scala.inline
  def cv81: typingsJapgolly.pdfkit.pdfkitStrings.cv81 = this.cast("cv81")
  @scala.inline
  def cv82: typingsJapgolly.pdfkit.pdfkitStrings.cv82 = this.cast("cv82")
  @scala.inline
  def cv83: typingsJapgolly.pdfkit.pdfkitStrings.cv83 = this.cast("cv83")
  @scala.inline
  def cv84: typingsJapgolly.pdfkit.pdfkitStrings.cv84 = this.cast("cv84")
  @scala.inline
  def cv85: typingsJapgolly.pdfkit.pdfkitStrings.cv85 = this.cast("cv85")
  @scala.inline
  def cv86: typingsJapgolly.pdfkit.pdfkitStrings.cv86 = this.cast("cv86")
  @scala.inline
  def cv87: typingsJapgolly.pdfkit.pdfkitStrings.cv87 = this.cast("cv87")
  @scala.inline
  def cv88: typingsJapgolly.pdfkit.pdfkitStrings.cv88 = this.cast("cv88")
  @scala.inline
  def cv89: typingsJapgolly.pdfkit.pdfkitStrings.cv89 = this.cast("cv89")
  @scala.inline
  def cv90: typingsJapgolly.pdfkit.pdfkitStrings.cv90 = this.cast("cv90")
  @scala.inline
  def cv91: typingsJapgolly.pdfkit.pdfkitStrings.cv91 = this.cast("cv91")
  @scala.inline
  def cv92: typingsJapgolly.pdfkit.pdfkitStrings.cv92 = this.cast("cv92")
  @scala.inline
  def cv93: typingsJapgolly.pdfkit.pdfkitStrings.cv93 = this.cast("cv93")
  @scala.inline
  def cv94: typingsJapgolly.pdfkit.pdfkitStrings.cv94 = this.cast("cv94")
  @scala.inline
  def cv95: typingsJapgolly.pdfkit.pdfkitStrings.cv95 = this.cast("cv95")
  @scala.inline
  def cv96: typingsJapgolly.pdfkit.pdfkitStrings.cv96 = this.cast("cv96")
  @scala.inline
  def cv97: typingsJapgolly.pdfkit.pdfkitStrings.cv97 = this.cast("cv97")
  @scala.inline
  def cv98: typingsJapgolly.pdfkit.pdfkitStrings.cv98 = this.cast("cv98")
  @scala.inline
  def cv99: typingsJapgolly.pdfkit.pdfkitStrings.cv99 = this.cast("cv99")
  @scala.inline
  def dist: typingsJapgolly.pdfkit.pdfkitStrings.dist = this.cast("dist")
  @scala.inline
  def dlig: typingsJapgolly.pdfkit.pdfkitStrings.dlig = this.cast("dlig")
  @scala.inline
  def dnom: typingsJapgolly.pdfkit.pdfkitStrings.dnom = this.cast("dnom")
  @scala.inline
  def dtls: typingsJapgolly.pdfkit.pdfkitStrings.dtls = this.cast("dtls")
  @scala.inline
  def expt: typingsJapgolly.pdfkit.pdfkitStrings.expt = this.cast("expt")
  @scala.inline
  def falt: typingsJapgolly.pdfkit.pdfkitStrings.falt = this.cast("falt")
  @scala.inline
  def fin2: typingsJapgolly.pdfkit.pdfkitStrings.fin2 = this.cast("fin2")
  @scala.inline
  def fin3: typingsJapgolly.pdfkit.pdfkitStrings.fin3 = this.cast("fin3")
  @scala.inline
  def fina: typingsJapgolly.pdfkit.pdfkitStrings.fina = this.cast("fina")
  @scala.inline
  def flac: typingsJapgolly.pdfkit.pdfkitStrings.flac = this.cast("flac")
  @scala.inline
  def frac: typingsJapgolly.pdfkit.pdfkitStrings.frac = this.cast("frac")
  @scala.inline
  def fwid: typingsJapgolly.pdfkit.pdfkitStrings.fwid = this.cast("fwid")
  @scala.inline
  def half: typingsJapgolly.pdfkit.pdfkitStrings.half = this.cast("half")
  @scala.inline
  def haln: typingsJapgolly.pdfkit.pdfkitStrings.haln = this.cast("haln")
  @scala.inline
  def halt: typingsJapgolly.pdfkit.pdfkitStrings.halt = this.cast("halt")
  @scala.inline
  def hist: typingsJapgolly.pdfkit.pdfkitStrings.hist = this.cast("hist")
  @scala.inline
  def hkna: typingsJapgolly.pdfkit.pdfkitStrings.hkna = this.cast("hkna")
  @scala.inline
  def hlig: typingsJapgolly.pdfkit.pdfkitStrings.hlig = this.cast("hlig")
  @scala.inline
  def hngl: typingsJapgolly.pdfkit.pdfkitStrings.hngl = this.cast("hngl")
  @scala.inline
  def hojo: typingsJapgolly.pdfkit.pdfkitStrings.hojo = this.cast("hojo")
  @scala.inline
  def hwid: typingsJapgolly.pdfkit.pdfkitStrings.hwid = this.cast("hwid")
  @scala.inline
  def init: typingsJapgolly.pdfkit.pdfkitStrings.init = this.cast("init")
  @scala.inline
  def isol: typingsJapgolly.pdfkit.pdfkitStrings.isol = this.cast("isol")
  @scala.inline
  def ital: typingsJapgolly.pdfkit.pdfkitStrings.ital = this.cast("ital")
  @scala.inline
  def jalt: typingsJapgolly.pdfkit.pdfkitStrings.jalt = this.cast("jalt")
  @scala.inline
  def jp04: typingsJapgolly.pdfkit.pdfkitStrings.jp04 = this.cast("jp04")
  @scala.inline
  def jp78: typingsJapgolly.pdfkit.pdfkitStrings.jp78 = this.cast("jp78")
  @scala.inline
  def jp83: typingsJapgolly.pdfkit.pdfkitStrings.jp83 = this.cast("jp83")
  @scala.inline
  def jp90: typingsJapgolly.pdfkit.pdfkitStrings.jp90 = this.cast("jp90")
  @scala.inline
  def kern: typingsJapgolly.pdfkit.pdfkitStrings.kern = this.cast("kern")
  @scala.inline
  def lfbd: typingsJapgolly.pdfkit.pdfkitStrings.lfbd = this.cast("lfbd")
  @scala.inline
  def liga: typingsJapgolly.pdfkit.pdfkitStrings.liga = this.cast("liga")
  @scala.inline
  def ljmo: typingsJapgolly.pdfkit.pdfkitStrings.ljmo = this.cast("ljmo")
  @scala.inline
  def lnum: typingsJapgolly.pdfkit.pdfkitStrings.lnum = this.cast("lnum")
  @scala.inline
  def locl: typingsJapgolly.pdfkit.pdfkitStrings.locl = this.cast("locl")
  @scala.inline
  def ltra: typingsJapgolly.pdfkit.pdfkitStrings.ltra = this.cast("ltra")
  @scala.inline
  def ltrm: typingsJapgolly.pdfkit.pdfkitStrings.ltrm = this.cast("ltrm")
  @scala.inline
  def mark: typingsJapgolly.pdfkit.pdfkitStrings.mark = this.cast("mark")
  @scala.inline
  def med2: typingsJapgolly.pdfkit.pdfkitStrings.med2 = this.cast("med2")
  @scala.inline
  def medi: typingsJapgolly.pdfkit.pdfkitStrings.medi = this.cast("medi")
  @scala.inline
  def mgrk: typingsJapgolly.pdfkit.pdfkitStrings.mgrk = this.cast("mgrk")
  @scala.inline
  def mkmk: typingsJapgolly.pdfkit.pdfkitStrings.mkmk = this.cast("mkmk")
  @scala.inline
  def mset: typingsJapgolly.pdfkit.pdfkitStrings.mset = this.cast("mset")
  @scala.inline
  def nalt: typingsJapgolly.pdfkit.pdfkitStrings.nalt = this.cast("nalt")
  @scala.inline
  def nlck: typingsJapgolly.pdfkit.pdfkitStrings.nlck = this.cast("nlck")
  @scala.inline
  def nukt: typingsJapgolly.pdfkit.pdfkitStrings.nukt = this.cast("nukt")
  @scala.inline
  def numr: typingsJapgolly.pdfkit.pdfkitStrings.numr = this.cast("numr")
  @scala.inline
  def onum: typingsJapgolly.pdfkit.pdfkitStrings.onum = this.cast("onum")
  @scala.inline
  def opbd: typingsJapgolly.pdfkit.pdfkitStrings.opbd = this.cast("opbd")
  @scala.inline
  def ordn: typingsJapgolly.pdfkit.pdfkitStrings.ordn = this.cast("ordn")
  @scala.inline
  def ornm: typingsJapgolly.pdfkit.pdfkitStrings.ornm = this.cast("ornm")
  @scala.inline
  def palt: typingsJapgolly.pdfkit.pdfkitStrings.palt = this.cast("palt")
  @scala.inline
  def pcap: typingsJapgolly.pdfkit.pdfkitStrings.pcap = this.cast("pcap")
  @scala.inline
  def pkna: typingsJapgolly.pdfkit.pdfkitStrings.pkna = this.cast("pkna")
  @scala.inline
  def pnum: typingsJapgolly.pdfkit.pdfkitStrings.pnum = this.cast("pnum")
  @scala.inline
  def pref: typingsJapgolly.pdfkit.pdfkitStrings.pref = this.cast("pref")
  @scala.inline
  def pres: typingsJapgolly.pdfkit.pdfkitStrings.pres = this.cast("pres")
  @scala.inline
  def pstf: typingsJapgolly.pdfkit.pdfkitStrings.pstf = this.cast("pstf")
  @scala.inline
  def psts: typingsJapgolly.pdfkit.pdfkitStrings.psts = this.cast("psts")
  @scala.inline
  def pwid: typingsJapgolly.pdfkit.pdfkitStrings.pwid = this.cast("pwid")
  @scala.inline
  def qwid: typingsJapgolly.pdfkit.pdfkitStrings.qwid = this.cast("qwid")
  @scala.inline
  def rand: typingsJapgolly.pdfkit.pdfkitStrings.rand = this.cast("rand")
  @scala.inline
  def rclt: typingsJapgolly.pdfkit.pdfkitStrings.rclt = this.cast("rclt")
  @scala.inline
  def rkrf: typingsJapgolly.pdfkit.pdfkitStrings.rkrf = this.cast("rkrf")
  @scala.inline
  def rlig: typingsJapgolly.pdfkit.pdfkitStrings.rlig = this.cast("rlig")
  @scala.inline
  def rphf: typingsJapgolly.pdfkit.pdfkitStrings.rphf = this.cast("rphf")
  @scala.inline
  def rtbd: typingsJapgolly.pdfkit.pdfkitStrings.rtbd = this.cast("rtbd")
  @scala.inline
  def rtla: typingsJapgolly.pdfkit.pdfkitStrings.rtla = this.cast("rtla")
  @scala.inline
  def rtlm: typingsJapgolly.pdfkit.pdfkitStrings.rtlm = this.cast("rtlm")
  @scala.inline
  def ruby: typingsJapgolly.pdfkit.pdfkitStrings.ruby = this.cast("ruby")
  @scala.inline
  def rvrn: typingsJapgolly.pdfkit.pdfkitStrings.rvrn = this.cast("rvrn")
  @scala.inline
  def salt: typingsJapgolly.pdfkit.pdfkitStrings.salt = this.cast("salt")
  @scala.inline
  def sinf: typingsJapgolly.pdfkit.pdfkitStrings.sinf = this.cast("sinf")
  @scala.inline
  def size: typingsJapgolly.pdfkit.pdfkitStrings.size = this.cast("size")
  @scala.inline
  def smcp: typingsJapgolly.pdfkit.pdfkitStrings.smcp = this.cast("smcp")
  @scala.inline
  def smpl: typingsJapgolly.pdfkit.pdfkitStrings.smpl = this.cast("smpl")
  @scala.inline
  def ss01: typingsJapgolly.pdfkit.pdfkitStrings.ss01 = this.cast("ss01")
  @scala.inline
  def ss02: typingsJapgolly.pdfkit.pdfkitStrings.ss02 = this.cast("ss02")
  @scala.inline
  def ss03: typingsJapgolly.pdfkit.pdfkitStrings.ss03 = this.cast("ss03")
  @scala.inline
  def ss04: typingsJapgolly.pdfkit.pdfkitStrings.ss04 = this.cast("ss04")
  @scala.inline
  def ss05: typingsJapgolly.pdfkit.pdfkitStrings.ss05 = this.cast("ss05")
  @scala.inline
  def ss06: typingsJapgolly.pdfkit.pdfkitStrings.ss06 = this.cast("ss06")
  @scala.inline
  def ss07: typingsJapgolly.pdfkit.pdfkitStrings.ss07 = this.cast("ss07")
  @scala.inline
  def ss08: typingsJapgolly.pdfkit.pdfkitStrings.ss08 = this.cast("ss08")
  @scala.inline
  def ss09: typingsJapgolly.pdfkit.pdfkitStrings.ss09 = this.cast("ss09")
  @scala.inline
  def ss10: typingsJapgolly.pdfkit.pdfkitStrings.ss10 = this.cast("ss10")
  @scala.inline
  def ss11: typingsJapgolly.pdfkit.pdfkitStrings.ss11 = this.cast("ss11")
  @scala.inline
  def ss12: typingsJapgolly.pdfkit.pdfkitStrings.ss12 = this.cast("ss12")
  @scala.inline
  def ss13: typingsJapgolly.pdfkit.pdfkitStrings.ss13 = this.cast("ss13")
  @scala.inline
  def ss14: typingsJapgolly.pdfkit.pdfkitStrings.ss14 = this.cast("ss14")
  @scala.inline
  def ss15: typingsJapgolly.pdfkit.pdfkitStrings.ss15 = this.cast("ss15")
  @scala.inline
  def ss16: typingsJapgolly.pdfkit.pdfkitStrings.ss16 = this.cast("ss16")
  @scala.inline
  def ss17: typingsJapgolly.pdfkit.pdfkitStrings.ss17 = this.cast("ss17")
  @scala.inline
  def ss18: typingsJapgolly.pdfkit.pdfkitStrings.ss18 = this.cast("ss18")
  @scala.inline
  def ss19: typingsJapgolly.pdfkit.pdfkitStrings.ss19 = this.cast("ss19")
  @scala.inline
  def ss20: typingsJapgolly.pdfkit.pdfkitStrings.ss20 = this.cast("ss20")
  @scala.inline
  def ssty: typingsJapgolly.pdfkit.pdfkitStrings.ssty = this.cast("ssty")
  @scala.inline
  def stch: typingsJapgolly.pdfkit.pdfkitStrings.stch = this.cast("stch")
  @scala.inline
  def subs: typingsJapgolly.pdfkit.pdfkitStrings.subs = this.cast("subs")
  @scala.inline
  def sups: typingsJapgolly.pdfkit.pdfkitStrings.sups = this.cast("sups")
  @scala.inline
  def swsh: typingsJapgolly.pdfkit.pdfkitStrings.swsh = this.cast("swsh")
  @scala.inline
  def titl: typingsJapgolly.pdfkit.pdfkitStrings.titl = this.cast("titl")
  @scala.inline
  def tjmo: typingsJapgolly.pdfkit.pdfkitStrings.tjmo = this.cast("tjmo")
  @scala.inline
  def tnam: typingsJapgolly.pdfkit.pdfkitStrings.tnam = this.cast("tnam")
  @scala.inline
  def tnum: typingsJapgolly.pdfkit.pdfkitStrings.tnum = this.cast("tnum")
  @scala.inline
  def trad: typingsJapgolly.pdfkit.pdfkitStrings.trad = this.cast("trad")
  @scala.inline
  def twid: typingsJapgolly.pdfkit.pdfkitStrings.twid = this.cast("twid")
  @scala.inline
  def unic: typingsJapgolly.pdfkit.pdfkitStrings.unic = this.cast("unic")
  @scala.inline
  def valt: typingsJapgolly.pdfkit.pdfkitStrings.valt = this.cast("valt")
  @scala.inline
  def vatu: typingsJapgolly.pdfkit.pdfkitStrings.vatu = this.cast("vatu")
  @scala.inline
  def vert: typingsJapgolly.pdfkit.pdfkitStrings.vert = this.cast("vert")
  @scala.inline
  def vhal: typingsJapgolly.pdfkit.pdfkitStrings.vhal = this.cast("vhal")
  @scala.inline
  def vjmo: typingsJapgolly.pdfkit.pdfkitStrings.vjmo = this.cast("vjmo")
  @scala.inline
  def vkna: typingsJapgolly.pdfkit.pdfkitStrings.vkna = this.cast("vkna")
  @scala.inline
  def vkrn: typingsJapgolly.pdfkit.pdfkitStrings.vkrn = this.cast("vkrn")
  @scala.inline
  def vpal: typingsJapgolly.pdfkit.pdfkitStrings.vpal = this.cast("vpal")
  @scala.inline
  def vrt2: typingsJapgolly.pdfkit.pdfkitStrings.vrt2 = this.cast("vrt2")
  @scala.inline
  def vrtr: typingsJapgolly.pdfkit.pdfkitStrings.vrtr = this.cast("vrtr")
  @scala.inline
  def zero: typingsJapgolly.pdfkit.pdfkitStrings.zero = this.cast("zero")
}

