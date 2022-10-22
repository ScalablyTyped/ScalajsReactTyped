package typingsJapgolly.pdfkit.PDFKit

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.pdfkit.anon.Origin
import typingsJapgolly.pdfkit.anon.Tagged
import typingsJapgolly.pdfkit.pdfkitStrings.Layout
import typingsJapgolly.pdfkit.pdfkitStrings.Page
import typingsJapgolly.pdfkit.pdfkitStrings.Pagination
import typingsJapgolly.pdfkit.pdfkitStrings.`svg-central`
import typingsJapgolly.pdfkit.pdfkitStrings.`svg-middle`
import typingsJapgolly.pdfkit.pdfkitStrings.alphabetic
import typingsJapgolly.pdfkit.pdfkitStrings.bottom
import typingsJapgolly.pdfkit.pdfkitStrings.bullet
import typingsJapgolly.pdfkit.pdfkitStrings.center
import typingsJapgolly.pdfkit.pdfkitStrings.hanging
import typingsJapgolly.pdfkit.pdfkitStrings.ideographic
import typingsJapgolly.pdfkit.pdfkitStrings.justify
import typingsJapgolly.pdfkit.pdfkitStrings.left
import typingsJapgolly.pdfkit.pdfkitStrings.lettered
import typingsJapgolly.pdfkit.pdfkitStrings.mathematical
import typingsJapgolly.pdfkit.pdfkitStrings.middle
import typingsJapgolly.pdfkit.pdfkitStrings.numbered
import typingsJapgolly.pdfkit.pdfkitStrings.right
import typingsJapgolly.pdfkit.pdfkitStrings.top
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Mixins {
  
  trait AnnotationOption extends StObject {
    
    var A: js.UndefOr[Any] = js.undefined
    
    var B: js.UndefOr[Any] = js.undefined
    
    var Border: js.UndefOr[js.Array[Double]] = js.undefined
    
    var C: js.UndefOr[Any] = js.undefined
    
    var Contents: js.UndefOr[String] = js.undefined
    
    var DA: js.UndefOr[String] = js.undefined
    
    var L: js.UndefOr[Any] = js.undefined
    
    var Name: js.UndefOr[String] = js.undefined
    
    var QuadPoints: js.UndefOr[js.Array[Double]] = js.undefined
    
    var Rect: js.UndefOr[Any] = js.undefined
    
    var SubType: js.UndefOr[String] = js.undefined
    
    var Type: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
  }
  object AnnotationOption {
    
    inline def apply(): AnnotationOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnnotationOption]
    }
    
    extension [Self <: AnnotationOption](x: Self) {
      
      inline def setA(value: Any): Self = StObject.set(x, "A", value.asInstanceOf[js.Any])
      
      inline def setAUndefined: Self = StObject.set(x, "A", js.undefined)
      
      inline def setB(value: Any): Self = StObject.set(x, "B", value.asInstanceOf[js.Any])
      
      inline def setBUndefined: Self = StObject.set(x, "B", js.undefined)
      
      inline def setBorder(value: js.Array[Double]): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "Border", js.undefined)
      
      inline def setBorderVarargs(value: Double*): Self = StObject.set(x, "Border", js.Array(value*))
      
      inline def setC(value: Any): Self = StObject.set(x, "C", value.asInstanceOf[js.Any])
      
      inline def setCUndefined: Self = StObject.set(x, "C", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setContents(value: String): Self = StObject.set(x, "Contents", value.asInstanceOf[js.Any])
      
      inline def setContentsUndefined: Self = StObject.set(x, "Contents", js.undefined)
      
      inline def setDA(value: String): Self = StObject.set(x, "DA", value.asInstanceOf[js.Any])
      
      inline def setDAUndefined: Self = StObject.set(x, "DA", js.undefined)
      
      inline def setL(value: Any): Self = StObject.set(x, "L", value.asInstanceOf[js.Any])
      
      inline def setLUndefined: Self = StObject.set(x, "L", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
      
      inline def setQuadPoints(value: js.Array[Double]): Self = StObject.set(x, "QuadPoints", value.asInstanceOf[js.Any])
      
      inline def setQuadPointsUndefined: Self = StObject.set(x, "QuadPoints", js.undefined)
      
      inline def setQuadPointsVarargs(value: Double*): Self = StObject.set(x, "QuadPoints", js.Array(value*))
      
      inline def setRect(value: Any): Self = StObject.set(x, "Rect", value.asInstanceOf[js.Any])
      
      inline def setRectUndefined: Self = StObject.set(x, "Rect", js.undefined)
      
      inline def setSubType(value: String): Self = StObject.set(x, "SubType", value.asInstanceOf[js.Any])
      
      inline def setSubTypeUndefined: Self = StObject.set(x, "SubType", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    }
  }
  
  // The color forms accepted by PDFKit:
  //     example:   "red"                  [R, G, B]                  [C, M, Y, K]
  type ColorValue = String | PDFGradient | (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
  
  trait ImageOption extends StObject {
    
    var align: js.UndefOr[center | right] = js.undefined
    
    var cover: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var destination: js.UndefOr[String] = js.undefined
    
    /** Two elements array specifying dimensions(w,h)  */
    var fit: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var goTo: js.UndefOr[AnnotationOption] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var link: js.UndefOr[AnnotationOption] = js.undefined
    
    /** Scale percentage */
    var scale: js.UndefOr[Double] = js.undefined
    
    var valign: js.UndefOr[center | bottom] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object ImageOption {
    
    inline def apply(): ImageOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageOption]
    }
    
    extension [Self <: ImageOption](x: Self) {
      
      inline def setAlign(value: center | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setCover(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "cover", value.asInstanceOf[js.Any])
      
      inline def setCoverUndefined: Self = StObject.set(x, "cover", js.undefined)
      
      inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
      
      inline def setFit(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
      
      inline def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
      
      inline def setGoTo(value: AnnotationOption): Self = StObject.set(x, "goTo", value.asInstanceOf[js.Any])
      
      inline def setGoToUndefined: Self = StObject.set(x, "goTo", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLink(value: AnnotationOption): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setValign(value: center | bottom): Self = StObject.set(x, "valign", value.asInstanceOf[js.Any])
      
      inline def setValignUndefined: Self = StObject.set(x, "valign", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait MarkingOptions extends StObject {
    
    var actual: js.UndefOr[String] = js.undefined
    
    var alt: js.UndefOr[String] = js.undefined
    
    var attached: js.UndefOr[js.Array[String]] = js.undefined
    
    var bbox: js.UndefOr[js.Tuple4[Double, Double, Double, Double]] = js.undefined
    
    var expanded: js.UndefOr[String] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[Pagination | Layout | Page] = js.undefined
  }
  object MarkingOptions {
    
    inline def apply(): MarkingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarkingOptions]
    }
    
    extension [Self <: MarkingOptions](x: Self) {
      
      inline def setActual(value: String): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
      
      inline def setActualUndefined: Self = StObject.set(x, "actual", js.undefined)
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setAttached(value: js.Array[String]): Self = StObject.set(x, "attached", value.asInstanceOf[js.Any])
      
      inline def setAttachedUndefined: Self = StObject.set(x, "attached", js.undefined)
      
      inline def setAttachedVarargs(value: String*): Self = StObject.set(x, "attached", js.Array(value*))
      
      inline def setBbox(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      inline def setBboxUndefined: Self = StObject.set(x, "bbox", js.undefined)
      
      inline def setExpanded(value: String): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setType(value: Pagination | Layout | Page): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
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
  trait OpenTypeFeatures extends StObject
  object OpenTypeFeatures {
    
    inline def aalt: typingsJapgolly.pdfkit.pdfkitStrings.aalt = "aalt".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.aalt]
    
    inline def abvf: typingsJapgolly.pdfkit.pdfkitStrings.abvf = "abvf".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.abvf]
    
    inline def abvm: typingsJapgolly.pdfkit.pdfkitStrings.abvm = "abvm".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.abvm]
    
    inline def abvs: typingsJapgolly.pdfkit.pdfkitStrings.abvs = "abvs".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.abvs]
    
    inline def afrc: typingsJapgolly.pdfkit.pdfkitStrings.afrc = "afrc".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.afrc]
    
    inline def akhn: typingsJapgolly.pdfkit.pdfkitStrings.akhn = "akhn".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.akhn]
    
    inline def blwf: typingsJapgolly.pdfkit.pdfkitStrings.blwf = "blwf".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.blwf]
    
    inline def blwm: typingsJapgolly.pdfkit.pdfkitStrings.blwm = "blwm".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.blwm]
    
    inline def blws: typingsJapgolly.pdfkit.pdfkitStrings.blws = "blws".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.blws]
    
    inline def c2pc: typingsJapgolly.pdfkit.pdfkitStrings.c2pc = "c2pc".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.c2pc]
    
    inline def c2sc: typingsJapgolly.pdfkit.pdfkitStrings.c2sc = "c2sc".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.c2sc]
    
    inline def calt: typingsJapgolly.pdfkit.pdfkitStrings.calt = "calt".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.calt]
    
    inline def `case`: typingsJapgolly.pdfkit.pdfkitStrings.`case` = "case".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.`case`]
    
    inline def ccmp: typingsJapgolly.pdfkit.pdfkitStrings.ccmp = "ccmp".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.ccmp]
    
    inline def cfar: typingsJapgolly.pdfkit.pdfkitStrings.cfar = "cfar".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cfar]
    
    inline def cjct: typingsJapgolly.pdfkit.pdfkitStrings.cjct = "cjct".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cjct]
    
    inline def clig: typingsJapgolly.pdfkit.pdfkitStrings.clig = "clig".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.clig]
    
    inline def cpct: typingsJapgolly.pdfkit.pdfkitStrings.cpct = "cpct".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cpct]
    
    inline def cpsp: typingsJapgolly.pdfkit.pdfkitStrings.cpsp = "cpsp".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cpsp]
    
    inline def cswh: typingsJapgolly.pdfkit.pdfkitStrings.cswh = "cswh".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cswh]
    
    inline def curs: typingsJapgolly.pdfkit.pdfkitStrings.curs = "curs".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.curs]
    
    inline def cv01: typingsJapgolly.pdfkit.pdfkitStrings.cv01 = "cv01".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv01]
    
    inline def cv02: typingsJapgolly.pdfkit.pdfkitStrings.cv02 = "cv02".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv02]
    
    inline def cv03: typingsJapgolly.pdfkit.pdfkitStrings.cv03 = "cv03".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv03]
    
    inline def cv04: typingsJapgolly.pdfkit.pdfkitStrings.cv04 = "cv04".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv04]
    
    inline def cv05: typingsJapgolly.pdfkit.pdfkitStrings.cv05 = "cv05".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv05]
    
    inline def cv06: typingsJapgolly.pdfkit.pdfkitStrings.cv06 = "cv06".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv06]
    
    inline def cv07: typingsJapgolly.pdfkit.pdfkitStrings.cv07 = "cv07".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv07]
    
    inline def cv08: typingsJapgolly.pdfkit.pdfkitStrings.cv08 = "cv08".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv08]
    
    inline def cv09: typingsJapgolly.pdfkit.pdfkitStrings.cv09 = "cv09".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv09]
    
    inline def cv10: typingsJapgolly.pdfkit.pdfkitStrings.cv10 = "cv10".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv10]
    
    inline def cv11: typingsJapgolly.pdfkit.pdfkitStrings.cv11 = "cv11".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv11]
    
    inline def cv12: typingsJapgolly.pdfkit.pdfkitStrings.cv12 = "cv12".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv12]
    
    inline def cv13: typingsJapgolly.pdfkit.pdfkitStrings.cv13 = "cv13".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv13]
    
    inline def cv14: typingsJapgolly.pdfkit.pdfkitStrings.cv14 = "cv14".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv14]
    
    inline def cv15: typingsJapgolly.pdfkit.pdfkitStrings.cv15 = "cv15".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv15]
    
    inline def cv16: typingsJapgolly.pdfkit.pdfkitStrings.cv16 = "cv16".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv16]
    
    inline def cv17: typingsJapgolly.pdfkit.pdfkitStrings.cv17 = "cv17".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv17]
    
    inline def cv18: typingsJapgolly.pdfkit.pdfkitStrings.cv18 = "cv18".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv18]
    
    inline def cv19: typingsJapgolly.pdfkit.pdfkitStrings.cv19 = "cv19".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv19]
    
    inline def cv20: typingsJapgolly.pdfkit.pdfkitStrings.cv20 = "cv20".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv20]
    
    inline def cv21: typingsJapgolly.pdfkit.pdfkitStrings.cv21 = "cv21".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv21]
    
    inline def cv22: typingsJapgolly.pdfkit.pdfkitStrings.cv22 = "cv22".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv22]
    
    inline def cv23: typingsJapgolly.pdfkit.pdfkitStrings.cv23 = "cv23".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv23]
    
    inline def cv24: typingsJapgolly.pdfkit.pdfkitStrings.cv24 = "cv24".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv24]
    
    inline def cv25: typingsJapgolly.pdfkit.pdfkitStrings.cv25 = "cv25".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv25]
    
    inline def cv26: typingsJapgolly.pdfkit.pdfkitStrings.cv26 = "cv26".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv26]
    
    inline def cv27: typingsJapgolly.pdfkit.pdfkitStrings.cv27 = "cv27".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv27]
    
    inline def cv28: typingsJapgolly.pdfkit.pdfkitStrings.cv28 = "cv28".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv28]
    
    inline def cv29: typingsJapgolly.pdfkit.pdfkitStrings.cv29 = "cv29".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv29]
    
    inline def cv30: typingsJapgolly.pdfkit.pdfkitStrings.cv30 = "cv30".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv30]
    
    inline def cv31: typingsJapgolly.pdfkit.pdfkitStrings.cv31 = "cv31".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv31]
    
    inline def cv32: typingsJapgolly.pdfkit.pdfkitStrings.cv32 = "cv32".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv32]
    
    inline def cv33: typingsJapgolly.pdfkit.pdfkitStrings.cv33 = "cv33".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv33]
    
    inline def cv34: typingsJapgolly.pdfkit.pdfkitStrings.cv34 = "cv34".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv34]
    
    inline def cv35: typingsJapgolly.pdfkit.pdfkitStrings.cv35 = "cv35".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv35]
    
    inline def cv36: typingsJapgolly.pdfkit.pdfkitStrings.cv36 = "cv36".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv36]
    
    inline def cv37: typingsJapgolly.pdfkit.pdfkitStrings.cv37 = "cv37".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv37]
    
    inline def cv38: typingsJapgolly.pdfkit.pdfkitStrings.cv38 = "cv38".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv38]
    
    inline def cv39: typingsJapgolly.pdfkit.pdfkitStrings.cv39 = "cv39".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv39]
    
    inline def cv40: typingsJapgolly.pdfkit.pdfkitStrings.cv40 = "cv40".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv40]
    
    inline def cv41: typingsJapgolly.pdfkit.pdfkitStrings.cv41 = "cv41".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv41]
    
    inline def cv42: typingsJapgolly.pdfkit.pdfkitStrings.cv42 = "cv42".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv42]
    
    inline def cv43: typingsJapgolly.pdfkit.pdfkitStrings.cv43 = "cv43".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv43]
    
    inline def cv44: typingsJapgolly.pdfkit.pdfkitStrings.cv44 = "cv44".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv44]
    
    inline def cv45: typingsJapgolly.pdfkit.pdfkitStrings.cv45 = "cv45".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv45]
    
    inline def cv46: typingsJapgolly.pdfkit.pdfkitStrings.cv46 = "cv46".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv46]
    
    inline def cv47: typingsJapgolly.pdfkit.pdfkitStrings.cv47 = "cv47".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv47]
    
    inline def cv48: typingsJapgolly.pdfkit.pdfkitStrings.cv48 = "cv48".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv48]
    
    inline def cv49: typingsJapgolly.pdfkit.pdfkitStrings.cv49 = "cv49".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv49]
    
    inline def cv50: typingsJapgolly.pdfkit.pdfkitStrings.cv50 = "cv50".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv50]
    
    inline def cv51: typingsJapgolly.pdfkit.pdfkitStrings.cv51 = "cv51".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv51]
    
    inline def cv52: typingsJapgolly.pdfkit.pdfkitStrings.cv52 = "cv52".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv52]
    
    inline def cv53: typingsJapgolly.pdfkit.pdfkitStrings.cv53 = "cv53".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv53]
    
    inline def cv54: typingsJapgolly.pdfkit.pdfkitStrings.cv54 = "cv54".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv54]
    
    inline def cv55: typingsJapgolly.pdfkit.pdfkitStrings.cv55 = "cv55".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv55]
    
    inline def cv56: typingsJapgolly.pdfkit.pdfkitStrings.cv56 = "cv56".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv56]
    
    inline def cv57: typingsJapgolly.pdfkit.pdfkitStrings.cv57 = "cv57".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv57]
    
    inline def cv58: typingsJapgolly.pdfkit.pdfkitStrings.cv58 = "cv58".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv58]
    
    inline def cv59: typingsJapgolly.pdfkit.pdfkitStrings.cv59 = "cv59".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv59]
    
    inline def cv60: typingsJapgolly.pdfkit.pdfkitStrings.cv60 = "cv60".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv60]
    
    inline def cv61: typingsJapgolly.pdfkit.pdfkitStrings.cv61 = "cv61".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv61]
    
    inline def cv62: typingsJapgolly.pdfkit.pdfkitStrings.cv62 = "cv62".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv62]
    
    inline def cv63: typingsJapgolly.pdfkit.pdfkitStrings.cv63 = "cv63".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv63]
    
    inline def cv64: typingsJapgolly.pdfkit.pdfkitStrings.cv64 = "cv64".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv64]
    
    inline def cv65: typingsJapgolly.pdfkit.pdfkitStrings.cv65 = "cv65".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv65]
    
    inline def cv66: typingsJapgolly.pdfkit.pdfkitStrings.cv66 = "cv66".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv66]
    
    inline def cv67: typingsJapgolly.pdfkit.pdfkitStrings.cv67 = "cv67".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv67]
    
    inline def cv68: typingsJapgolly.pdfkit.pdfkitStrings.cv68 = "cv68".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv68]
    
    inline def cv69: typingsJapgolly.pdfkit.pdfkitStrings.cv69 = "cv69".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv69]
    
    inline def cv70: typingsJapgolly.pdfkit.pdfkitStrings.cv70 = "cv70".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv70]
    
    inline def cv71: typingsJapgolly.pdfkit.pdfkitStrings.cv71 = "cv71".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv71]
    
    inline def cv72: typingsJapgolly.pdfkit.pdfkitStrings.cv72 = "cv72".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv72]
    
    inline def cv73: typingsJapgolly.pdfkit.pdfkitStrings.cv73 = "cv73".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv73]
    
    inline def cv74: typingsJapgolly.pdfkit.pdfkitStrings.cv74 = "cv74".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv74]
    
    inline def cv75: typingsJapgolly.pdfkit.pdfkitStrings.cv75 = "cv75".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv75]
    
    inline def cv76: typingsJapgolly.pdfkit.pdfkitStrings.cv76 = "cv76".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv76]
    
    inline def cv77: typingsJapgolly.pdfkit.pdfkitStrings.cv77 = "cv77".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv77]
    
    inline def cv78: typingsJapgolly.pdfkit.pdfkitStrings.cv78 = "cv78".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv78]
    
    inline def cv79: typingsJapgolly.pdfkit.pdfkitStrings.cv79 = "cv79".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv79]
    
    inline def cv80: typingsJapgolly.pdfkit.pdfkitStrings.cv80 = "cv80".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv80]
    
    inline def cv81: typingsJapgolly.pdfkit.pdfkitStrings.cv81 = "cv81".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv81]
    
    inline def cv82: typingsJapgolly.pdfkit.pdfkitStrings.cv82 = "cv82".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv82]
    
    inline def cv83: typingsJapgolly.pdfkit.pdfkitStrings.cv83 = "cv83".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv83]
    
    inline def cv84: typingsJapgolly.pdfkit.pdfkitStrings.cv84 = "cv84".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv84]
    
    inline def cv85: typingsJapgolly.pdfkit.pdfkitStrings.cv85 = "cv85".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv85]
    
    inline def cv86: typingsJapgolly.pdfkit.pdfkitStrings.cv86 = "cv86".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv86]
    
    inline def cv87: typingsJapgolly.pdfkit.pdfkitStrings.cv87 = "cv87".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv87]
    
    inline def cv88: typingsJapgolly.pdfkit.pdfkitStrings.cv88 = "cv88".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv88]
    
    inline def cv89: typingsJapgolly.pdfkit.pdfkitStrings.cv89 = "cv89".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv89]
    
    inline def cv90: typingsJapgolly.pdfkit.pdfkitStrings.cv90 = "cv90".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv90]
    
    inline def cv91: typingsJapgolly.pdfkit.pdfkitStrings.cv91 = "cv91".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv91]
    
    inline def cv92: typingsJapgolly.pdfkit.pdfkitStrings.cv92 = "cv92".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv92]
    
    inline def cv93: typingsJapgolly.pdfkit.pdfkitStrings.cv93 = "cv93".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv93]
    
    inline def cv94: typingsJapgolly.pdfkit.pdfkitStrings.cv94 = "cv94".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv94]
    
    inline def cv95: typingsJapgolly.pdfkit.pdfkitStrings.cv95 = "cv95".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv95]
    
    inline def cv96: typingsJapgolly.pdfkit.pdfkitStrings.cv96 = "cv96".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv96]
    
    inline def cv97: typingsJapgolly.pdfkit.pdfkitStrings.cv97 = "cv97".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv97]
    
    inline def cv98: typingsJapgolly.pdfkit.pdfkitStrings.cv98 = "cv98".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv98]
    
    inline def cv99: typingsJapgolly.pdfkit.pdfkitStrings.cv99 = "cv99".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.cv99]
    
    inline def dist: typingsJapgolly.pdfkit.pdfkitStrings.dist = "dist".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.dist]
    
    inline def dlig: typingsJapgolly.pdfkit.pdfkitStrings.dlig = "dlig".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.dlig]
    
    inline def dnom: typingsJapgolly.pdfkit.pdfkitStrings.dnom = "dnom".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.dnom]
    
    inline def dtls: typingsJapgolly.pdfkit.pdfkitStrings.dtls = "dtls".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.dtls]
    
    inline def expt: typingsJapgolly.pdfkit.pdfkitStrings.expt = "expt".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.expt]
    
    inline def falt: typingsJapgolly.pdfkit.pdfkitStrings.falt = "falt".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.falt]
    
    inline def fin2: typingsJapgolly.pdfkit.pdfkitStrings.fin2 = "fin2".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.fin2]
    
    inline def fin3: typingsJapgolly.pdfkit.pdfkitStrings.fin3 = "fin3".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.fin3]
    
    inline def fina: typingsJapgolly.pdfkit.pdfkitStrings.fina = "fina".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.fina]
    
    inline def flac: typingsJapgolly.pdfkit.pdfkitStrings.flac = "flac".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.flac]
    
    inline def frac: typingsJapgolly.pdfkit.pdfkitStrings.frac = "frac".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.frac]
    
    inline def fwid: typingsJapgolly.pdfkit.pdfkitStrings.fwid = "fwid".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.fwid]
    
    inline def half: typingsJapgolly.pdfkit.pdfkitStrings.half = "half".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.half]
    
    inline def haln: typingsJapgolly.pdfkit.pdfkitStrings.haln = "haln".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.haln]
    
    inline def halt: typingsJapgolly.pdfkit.pdfkitStrings.halt = "halt".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.halt]
    
    inline def hist: typingsJapgolly.pdfkit.pdfkitStrings.hist = "hist".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.hist]
    
    inline def hkna: typingsJapgolly.pdfkit.pdfkitStrings.hkna = "hkna".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.hkna]
    
    inline def hlig: typingsJapgolly.pdfkit.pdfkitStrings.hlig = "hlig".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.hlig]
    
    inline def hngl: typingsJapgolly.pdfkit.pdfkitStrings.hngl = "hngl".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.hngl]
    
    inline def hojo: typingsJapgolly.pdfkit.pdfkitStrings.hojo = "hojo".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.hojo]
    
    inline def hwid: typingsJapgolly.pdfkit.pdfkitStrings.hwid = "hwid".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.hwid]
    
    inline def init: typingsJapgolly.pdfkit.pdfkitStrings.init = "init".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.init]
    
    inline def isol: typingsJapgolly.pdfkit.pdfkitStrings.isol = "isol".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.isol]
    
    inline def ital: typingsJapgolly.pdfkit.pdfkitStrings.ital = "ital".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.ital]
    
    inline def jalt: typingsJapgolly.pdfkit.pdfkitStrings.jalt = "jalt".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.jalt]
    
    inline def jp04: typingsJapgolly.pdfkit.pdfkitStrings.jp04 = "jp04".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.jp04]
    
    inline def jp78: typingsJapgolly.pdfkit.pdfkitStrings.jp78 = "jp78".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.jp78]
    
    inline def jp83: typingsJapgolly.pdfkit.pdfkitStrings.jp83 = "jp83".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.jp83]
    
    inline def jp90: typingsJapgolly.pdfkit.pdfkitStrings.jp90 = "jp90".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.jp90]
    
    inline def kern: typingsJapgolly.pdfkit.pdfkitStrings.kern = "kern".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.kern]
    
    inline def lfbd: typingsJapgolly.pdfkit.pdfkitStrings.lfbd = "lfbd".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.lfbd]
    
    inline def liga: typingsJapgolly.pdfkit.pdfkitStrings.liga = "liga".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.liga]
    
    inline def ljmo: typingsJapgolly.pdfkit.pdfkitStrings.ljmo = "ljmo".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.ljmo]
    
    inline def lnum: typingsJapgolly.pdfkit.pdfkitStrings.lnum = "lnum".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.lnum]
    
    inline def locl: typingsJapgolly.pdfkit.pdfkitStrings.locl = "locl".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.locl]
    
    inline def ltra: typingsJapgolly.pdfkit.pdfkitStrings.ltra = "ltra".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.ltra]
    
    inline def ltrm: typingsJapgolly.pdfkit.pdfkitStrings.ltrm = "ltrm".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.ltrm]
    
    inline def mark: typingsJapgolly.pdfkit.pdfkitStrings.mark = "mark".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.mark]
    
    inline def med2: typingsJapgolly.pdfkit.pdfkitStrings.med2 = "med2".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.med2]
    
    inline def medi: typingsJapgolly.pdfkit.pdfkitStrings.medi = "medi".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.medi]
    
    inline def mgrk: typingsJapgolly.pdfkit.pdfkitStrings.mgrk = "mgrk".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.mgrk]
    
    inline def mkmk: typingsJapgolly.pdfkit.pdfkitStrings.mkmk = "mkmk".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.mkmk]
    
    inline def mset: typingsJapgolly.pdfkit.pdfkitStrings.mset = "mset".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.mset]
    
    inline def nalt: typingsJapgolly.pdfkit.pdfkitStrings.nalt = "nalt".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.nalt]
    
    inline def nlck: typingsJapgolly.pdfkit.pdfkitStrings.nlck = "nlck".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.nlck]
    
    inline def nukt: typingsJapgolly.pdfkit.pdfkitStrings.nukt = "nukt".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.nukt]
    
    inline def numr: typingsJapgolly.pdfkit.pdfkitStrings.numr = "numr".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.numr]
    
    inline def onum: typingsJapgolly.pdfkit.pdfkitStrings.onum = "onum".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.onum]
    
    inline def opbd: typingsJapgolly.pdfkit.pdfkitStrings.opbd = "opbd".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.opbd]
    
    inline def ordn: typingsJapgolly.pdfkit.pdfkitStrings.ordn = "ordn".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.ordn]
    
    inline def ornm: typingsJapgolly.pdfkit.pdfkitStrings.ornm = "ornm".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.ornm]
    
    inline def palt: typingsJapgolly.pdfkit.pdfkitStrings.palt = "palt".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.palt]
    
    inline def pcap: typingsJapgolly.pdfkit.pdfkitStrings.pcap = "pcap".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.pcap]
    
    inline def pkna: typingsJapgolly.pdfkit.pdfkitStrings.pkna = "pkna".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.pkna]
    
    inline def pnum: typingsJapgolly.pdfkit.pdfkitStrings.pnum = "pnum".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.pnum]
    
    inline def pref: typingsJapgolly.pdfkit.pdfkitStrings.pref = "pref".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.pref]
    
    inline def pres: typingsJapgolly.pdfkit.pdfkitStrings.pres = "pres".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.pres]
    
    inline def pstf: typingsJapgolly.pdfkit.pdfkitStrings.pstf = "pstf".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.pstf]
    
    inline def psts: typingsJapgolly.pdfkit.pdfkitStrings.psts = "psts".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.psts]
    
    inline def pwid: typingsJapgolly.pdfkit.pdfkitStrings.pwid = "pwid".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.pwid]
    
    inline def qwid: typingsJapgolly.pdfkit.pdfkitStrings.qwid = "qwid".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.qwid]
    
    inline def rand: typingsJapgolly.pdfkit.pdfkitStrings.rand = "rand".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.rand]
    
    inline def rclt: typingsJapgolly.pdfkit.pdfkitStrings.rclt = "rclt".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.rclt]
    
    inline def rkrf: typingsJapgolly.pdfkit.pdfkitStrings.rkrf = "rkrf".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.rkrf]
    
    inline def rlig: typingsJapgolly.pdfkit.pdfkitStrings.rlig = "rlig".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.rlig]
    
    inline def rphf: typingsJapgolly.pdfkit.pdfkitStrings.rphf = "rphf".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.rphf]
    
    inline def rtbd: typingsJapgolly.pdfkit.pdfkitStrings.rtbd = "rtbd".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.rtbd]
    
    inline def rtla: typingsJapgolly.pdfkit.pdfkitStrings.rtla = "rtla".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.rtla]
    
    inline def rtlm: typingsJapgolly.pdfkit.pdfkitStrings.rtlm = "rtlm".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.rtlm]
    
    inline def ruby: typingsJapgolly.pdfkit.pdfkitStrings.ruby = "ruby".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.ruby]
    
    inline def rvrn: typingsJapgolly.pdfkit.pdfkitStrings.rvrn = "rvrn".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.rvrn]
    
    inline def salt: typingsJapgolly.pdfkit.pdfkitStrings.salt = "salt".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.salt]
    
    inline def sinf: typingsJapgolly.pdfkit.pdfkitStrings.sinf = "sinf".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.sinf]
    
    inline def size: typingsJapgolly.pdfkit.pdfkitStrings.size = "size".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.size]
    
    inline def smcp: typingsJapgolly.pdfkit.pdfkitStrings.smcp = "smcp".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.smcp]
    
    inline def smpl: typingsJapgolly.pdfkit.pdfkitStrings.smpl = "smpl".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.smpl]
    
    inline def ss01: typingsJapgolly.pdfkit.pdfkitStrings.ss01 = "ss01".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.ss01]
    
    inline def ss02: typingsJapgolly.pdfkit.pdfkitStrings.ss02 = "ss02".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.ss02]
    
    inline def ss03: typingsJapgolly.pdfkit.pdfkitStrings.ss03 = "ss03".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.ss03]
    
    inline def ss04: typingsJapgolly.pdfkit.pdfkitStrings.ss04 = "ss04".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.ss04]
    
    inline def ss05: typingsJapgolly.pdfkit.pdfkitStrings.ss05 = "ss05".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.ss05]
    
    inline def ss06: typingsJapgolly.pdfkit.pdfkitStrings.ss06 = "ss06".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.ss06]
    
    inline def ss07: typingsJapgolly.pdfkit.pdfkitStrings.ss07 = "ss07".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.ss07]
    
    inline def ss08: typingsJapgolly.pdfkit.pdfkitStrings.ss08 = "ss08".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.ss08]
    
    inline def ss09: typingsJapgolly.pdfkit.pdfkitStrings.ss09 = "ss09".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.ss09]
    
    inline def ss10: typingsJapgolly.pdfkit.pdfkitStrings.ss10 = "ss10".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.ss10]
    
    inline def ss11: typingsJapgolly.pdfkit.pdfkitStrings.ss11 = "ss11".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.ss11]
    
    inline def ss12: typingsJapgolly.pdfkit.pdfkitStrings.ss12 = "ss12".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.ss12]
    
    inline def ss13: typingsJapgolly.pdfkit.pdfkitStrings.ss13 = "ss13".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.ss13]
    
    inline def ss14: typingsJapgolly.pdfkit.pdfkitStrings.ss14 = "ss14".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.ss14]
    
    inline def ss15: typingsJapgolly.pdfkit.pdfkitStrings.ss15 = "ss15".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.ss15]
    
    inline def ss16: typingsJapgolly.pdfkit.pdfkitStrings.ss16 = "ss16".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.ss16]
    
    inline def ss17: typingsJapgolly.pdfkit.pdfkitStrings.ss17 = "ss17".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.ss17]
    
    inline def ss18: typingsJapgolly.pdfkit.pdfkitStrings.ss18 = "ss18".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.ss18]
    
    inline def ss19: typingsJapgolly.pdfkit.pdfkitStrings.ss19 = "ss19".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.ss19]
    
    inline def ss20: typingsJapgolly.pdfkit.pdfkitStrings.ss20 = "ss20".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.ss20]
    
    inline def ssty: typingsJapgolly.pdfkit.pdfkitStrings.ssty = "ssty".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.ssty]
    
    inline def stch: typingsJapgolly.pdfkit.pdfkitStrings.stch = "stch".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.stch]
    
    inline def subs: typingsJapgolly.pdfkit.pdfkitStrings.subs = "subs".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.subs]
    
    inline def sups: typingsJapgolly.pdfkit.pdfkitStrings.sups = "sups".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.sups]
    
    inline def swsh: typingsJapgolly.pdfkit.pdfkitStrings.swsh = "swsh".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.swsh]
    
    inline def titl: typingsJapgolly.pdfkit.pdfkitStrings.titl = "titl".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.titl]
    
    inline def tjmo: typingsJapgolly.pdfkit.pdfkitStrings.tjmo = "tjmo".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.tjmo]
    
    inline def tnam: typingsJapgolly.pdfkit.pdfkitStrings.tnam = "tnam".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.tnam]
    
    inline def tnum: typingsJapgolly.pdfkit.pdfkitStrings.tnum = "tnum".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.tnum]
    
    inline def trad: typingsJapgolly.pdfkit.pdfkitStrings.trad = "trad".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.trad]
    
    inline def twid: typingsJapgolly.pdfkit.pdfkitStrings.twid = "twid".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.twid]
    
    inline def unic: typingsJapgolly.pdfkit.pdfkitStrings.unic = "unic".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.unic]
    
    inline def valt: typingsJapgolly.pdfkit.pdfkitStrings.valt = "valt".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.valt]
    
    inline def vatu: typingsJapgolly.pdfkit.pdfkitStrings.vatu = "vatu".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.vatu]
    
    inline def vert: typingsJapgolly.pdfkit.pdfkitStrings.vert = "vert".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.vert]
    
    inline def vhal: typingsJapgolly.pdfkit.pdfkitStrings.vhal = "vhal".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.vhal]
    
    inline def vjmo: typingsJapgolly.pdfkit.pdfkitStrings.vjmo = "vjmo".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.vjmo]
    
    inline def vkna: typingsJapgolly.pdfkit.pdfkitStrings.vkna = "vkna".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.vkna]
    
    inline def vkrn: typingsJapgolly.pdfkit.pdfkitStrings.vkrn = "vkrn".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.vkrn]
    
    inline def vpal: typingsJapgolly.pdfkit.pdfkitStrings.vpal = "vpal".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.vpal]
    
    inline def vrt2: typingsJapgolly.pdfkit.pdfkitStrings.vrt2 = "vrt2".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.vrt2]
    
    inline def vrtr: typingsJapgolly.pdfkit.pdfkitStrings.vrtr = "vrtr".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.vrtr]
    
    inline def zero: typingsJapgolly.pdfkit.pdfkitStrings.zero = "zero".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.zero]
  }
  
  @js.native
  trait PDFAcroForm extends StObject {
    
    /**
      * Called automatically by document.js
      */
    def endAcroForm(): this.type = js.native
    
    /**
      * Creates and adds a Form Annotation to the document. Form annotations are
      * called Widget annotations internally within a PDF file.
      * @param name - form field name (T attribute of widget annotation
      * dictionary)
      */
    def formAnnotation(name: String, `type`: String, x: Double, y: Double, w: Double, h: Double): this.type = js.native
    def formAnnotation(name: String, `type`: String, x: Double, y: Double, w: Double, h: Double, options: js.Object): this.type = js.native
    
    def formCheckbox(name: String, x: Double, y: Double, w: Double, h: Double): this.type = js.native
    def formCheckbox(name: String, x: Double, y: Double, w: Double, h: Double, options: js.Object): this.type = js.native
    
    def formCombo(name: String, x: Double, y: Double, w: Double, h: Double): this.type = js.native
    def formCombo(name: String, x: Double, y: Double, w: Double, h: Double, options: js.Object): this.type = js.native
    
    /**
      * Creates and adds a form field to the document. Form fields are intermediate
      * nodes in a PDF form that are used to specify form name heirarchy and form
      * value defaults.
      * @param name - field name (T attribute in field dictionary)
      * @param options  - other attributes to include in field dictionary
      */
    def formField(name: String): PDFKitReference = js.native
    def formField(name: String, options: Record[String, Any]): PDFKitReference = js.native
    
    def formList(name: String, x: Double, y: Double, w: Double, h: Double): this.type = js.native
    def formList(name: String, x: Double, y: Double, w: Double, h: Double, options: js.Object): this.type = js.native
    
    def formPushButton(name: String, x: Double, y: Double, w: Double, h: Double): this.type = js.native
    def formPushButton(name: String, x: Double, y: Double, w: Double, h: Double, options: js.Object): this.type = js.native
    
    def formRadioButton(name: String, x: Double, y: Double, w: Double, h: Double): this.type = js.native
    def formRadioButton(name: String, x: Double, y: Double, w: Double, h: Double, options: js.Object): this.type = js.native
    
    def formText(name: String, x: Double, y: Double, w: Double, h: Double): this.type = js.native
    def formText(name: String, x: Double, y: Double, w: Double, h: Double, options: js.Object): this.type = js.native
    
    /**
      * Must call if adding AcroForms to a document. Must also call font() before
      * this method to set the default font.
      */
    def initForm(): this.type = js.native
  }
  
  @js.native
  trait PDFAnnotation extends StObject {
    
    def annotate(x: Double, y: Double, w: Double, h: Double, option: AnnotationOption): this.type = js.native
    
    def ellipseAnnotation(x: Double, y: Double, w: Double, h: Double): this.type = js.native
    def ellipseAnnotation(x: Double, y: Double, w: Double, h: Double, option: AnnotationOption): this.type = js.native
    
    def goTo(x: Double, y: Double, w: Double, h: Double, name: String): this.type = js.native
    def goTo(x: Double, y: Double, w: Double, h: Double, name: String, options: AnnotationOption): this.type = js.native
    
    def highlight(x: Double, y: Double, w: Double, h: Double): this.type = js.native
    def highlight(x: Double, y: Double, w: Double, h: Double, option: AnnotationOption): this.type = js.native
    
    def lineAnnotation(x1: Double, y1: Double, x2: Double, y2: Double): this.type = js.native
    def lineAnnotation(x1: Double, y1: Double, x2: Double, y2: Double, option: AnnotationOption): this.type = js.native
    
    def link(x: Double, y: Double, w: Double, h: Double, url: String): this.type = js.native
    def link(x: Double, y: Double, w: Double, h: Double, url: String, option: AnnotationOption): this.type = js.native
    
    def note(x: Double, y: Double, w: Double, h: Double, content: String): this.type = js.native
    def note(x: Double, y: Double, w: Double, h: Double, content: String, option: AnnotationOption): this.type = js.native
    
    def rectAnnotation(x: Double, y: Double, w: Double, h: Double): this.type = js.native
    def rectAnnotation(x: Double, y: Double, w: Double, h: Double, option: AnnotationOption): this.type = js.native
    
    def strike(x: Double, y: Double, w: Double, h: Double): this.type = js.native
    def strike(x: Double, y: Double, w: Double, h: Double, option: AnnotationOption): this.type = js.native
    
    def textAnnotation(x: Double, y: Double, w: Double, h: Double, text: String): this.type = js.native
    def textAnnotation(x: Double, y: Double, w: Double, h: Double, text: String, option: AnnotationOption): this.type = js.native
    
    def underline(x: Double, y: Double, w: Double, h: Double): this.type = js.native
    def underline(x: Double, y: Double, w: Double, h: Double, option: AnnotationOption): this.type = js.native
  }
  
  @js.native
  trait PDFAttachment extends StObject {
    
    def file(src: String): this.type = js.native
    def file(src: String, options: PDFAttachmentOptions): this.type = js.native
    def file(src: js.typedarray.ArrayBuffer): this.type = js.native
    def file(src: js.typedarray.ArrayBuffer, options: PDFAttachmentOptions): this.type = js.native
    /**
      * Embed content of `src` in PDF
      */
    def file(src: Buffer): this.type = js.native
    def file(src: Buffer, options: PDFAttachmentOptions): this.type = js.native
  }
  
  trait PDFAttachmentOptions extends StObject {
    
    var creationDate: js.UndefOr[js.Date] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var modifiedDate: js.UndefOr[js.Date] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object PDFAttachmentOptions {
    
    inline def apply(): PDFAttachmentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PDFAttachmentOptions]
    }
    
    extension [Self <: PDFAttachmentOptions](x: Self) {
      
      inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
      
      inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setModifiedDate(value: js.Date): Self = StObject.set(x, "modifiedDate", value.asInstanceOf[js.Any])
      
      inline def setModifiedDateUndefined: Self = StObject.set(x, "modifiedDate", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait PDFColor extends StObject {
    
    def fillColor(color: ColorValue): this.type = js.native
    def fillColor(color: ColorValue, opacity: Double): this.type = js.native
    
    def fillOpacity(opacity: Double): this.type = js.native
    
    def linearGradient(x1: Double, y1: Double, x2: Double, y2: Double): PDFLinearGradient = js.native
    
    def opacity(opacity: Double): this.type = js.native
    
    def radialGradient(x1: Double, y1: Double, r1: Double, x2: Double, y2: Double, r2: Double): PDFRadialGradient = js.native
    
    def strokeColor(color: ColorValue): this.type = js.native
    def strokeColor(color: ColorValue, opacity: Double): this.type = js.native
    
    def strokeOpacity(opacity: Double): this.type = js.native
  }
  
  @js.native
  trait PDFFont extends StObject {
    
    def currentLineHeight(): Double = js.native
    def currentLineHeight(includeGap: Boolean): Double = js.native
    
    def font(src: PDFFontSource): this.type = js.native
    def font(src: PDFFontSource, family: String): this.type = js.native
    def font(src: PDFFontSource, family: String, size: Double): this.type = js.native
    def font(src: PDFFontSource, size: Double): this.type = js.native
    
    def fontSize(size: Double): this.type = js.native
    
    def registerFont(name: String): this.type = js.native
    def registerFont(name: String, src: Unit, family: String): this.type = js.native
    def registerFont(name: String, src: PDFFontSource): this.type = js.native
    def registerFont(name: String, src: PDFFontSource, family: String): this.type = js.native
  }
  
  type PDFFontSource = String | Buffer | js.typedarray.Uint8Array | js.typedarray.ArrayBuffer
  
  @js.native
  trait PDFImage extends StObject {
    
    /**
      * Draw an image in PDFKit document.
      */
    def image(src: Any): this.type = js.native
    def image(src: Any, options: ImageOption): this.type = js.native
    def image(src: Any, x: Double): this.type = js.native
    def image(src: Any, x: Double, y: Double): this.type = js.native
    def image(src: Any, x: Double, y: Double, options: ImageOption): this.type = js.native
    def image(src: Any, x: Double, y: Unit, options: ImageOption): this.type = js.native
    def image(src: Any, x: Unit, y: Double): this.type = js.native
    def image(src: Any, x: Unit, y: Double, options: ImageOption): this.type = js.native
    def image(src: Any, x: Unit, y: Unit, options: ImageOption): this.type = js.native
  }
  
  @js.native
  trait PDFMarking extends StObject {
    
    def addStructure(structElem: PDFStructureElement): this.type = js.native
    
    def createStructParentTreeNextKey(): Double = js.native
    
    def endMarkedContent(): this.type = js.native
    
    def endMarkings(): Unit = js.native
    
    def endPageMarkings(page: PDFPage): js.Array[PageMarking] = js.native
    
    def getMarkingsDictionary(): PDFKitReference = js.native
    
    def getStructTreeRoot(): PDFKitReference = js.native
    
    def initMarkings(): Unit = js.native
    def initMarkings(options: Tagged): Unit = js.native
    
    def initPageMarkings(pageMarkings: js.Array[PageMarking]): Unit = js.native
    
    def markContent(tag: String): this.type = js.native
    def markContent(tag: String, options: MarkingOptions): this.type = js.native
    
    def markStructureContent(tag: String): PDFStructureContent = js.native
    def markStructureContent(tag: String, options: MarkingOptions): PDFStructureContent = js.native
    
    def struct(tag: String): PDFStructureElement = js.native
    def struct(tag: String, options: Unit, children: js.Array[PDFStructureElementChild]): PDFStructureElement = js.native
    def struct(tag: String, options: Unit, children: PDFStructureElementChild): PDFStructureElement = js.native
    def struct(tag: String, options: MarkingOptions): PDFStructureElement = js.native
    def struct(tag: String, options: MarkingOptions, children: js.Array[PDFStructureElementChild]): PDFStructureElement = js.native
    def struct(tag: String, options: MarkingOptions, children: PDFStructureElementChild): PDFStructureElement = js.native
  }
  
  @js.native
  trait PDFText extends StObject {
    
    def heightOfString(text: String): Double = js.native
    def heightOfString(text: String, options: TextOptions): Double = js.native
    
    def lineGap(lineGap: Double): this.type = js.native
    
    def list(list: js.Array[String | Any]): this.type = js.native
    def list(list: js.Array[String | Any], options: TextOptions): this.type = js.native
    def list(list: js.Array[String | Any], x: Double): this.type = js.native
    def list(list: js.Array[String | Any], x: Double, y: Double): this.type = js.native
    def list(list: js.Array[String | Any], x: Double, y: Double, options: TextOptions): this.type = js.native
    def list(list: js.Array[String | Any], x: Double, y: Unit, options: TextOptions): this.type = js.native
    def list(list: js.Array[String | Any], x: Unit, y: Double): this.type = js.native
    def list(list: js.Array[String | Any], x: Unit, y: Double, options: TextOptions): this.type = js.native
    def list(list: js.Array[String | Any], x: Unit, y: Unit, options: TextOptions): this.type = js.native
    
    def moveDown(): this.type = js.native
    def moveDown(line: Double): this.type = js.native
    
    def moveUp(): this.type = js.native
    def moveUp(line: Double): this.type = js.native
    
    def text(text: String): this.type = js.native
    def text(text: String, options: TextOptions): this.type = js.native
    def text(text: String, x: Double): this.type = js.native
    def text(text: String, x: Double, y: Double): this.type = js.native
    def text(text: String, x: Double, y: Double, options: TextOptions): this.type = js.native
    def text(text: String, x: Double, y: Unit, options: TextOptions): this.type = js.native
    def text(text: String, x: Unit, y: Double): this.type = js.native
    def text(text: String, x: Unit, y: Double, options: TextOptions): this.type = js.native
    def text(text: String, x: Unit, y: Unit, options: TextOptions): this.type = js.native
    
    def widthOfString(text: String): Double = js.native
    def widthOfString(text: String, options: TextOptions): Double = js.native
  }
  
  @js.native
  trait PDFVector extends StObject {
    
    def bezierCurveTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double): this.type = js.native
    
    def circle(x: Double, y: Double, radius: Double): this.type = js.native
    
    def clip(): this.type = js.native
    def clip(rule: RuleValue): this.type = js.native
    
    def closePath(): this.type = js.native
    
    def dash(length: Double, option: Any): this.type = js.native
    
    def ellipse(x: Double, y: Double, r1: Double): this.type = js.native
    def ellipse(x: Double, y: Double, r1: Double, r2: Double): this.type = js.native
    
    def fill(): this.type = js.native
    def fill(color: Unit, rule: RuleValue): this.type = js.native
    def fill(color: ColorValue): this.type = js.native
    def fill(color: ColorValue, rule: RuleValue): this.type = js.native
    def fill(rule: RuleValue): this.type = js.native
    
    def fillAndStroke(): this.type = js.native
    def fillAndStroke(fillColor: Unit, strokeColor: Unit, rule: RuleValue): this.type = js.native
    def fillAndStroke(fillColor: Unit, strokeColor: ColorValue): this.type = js.native
    def fillAndStroke(fillColor: Unit, strokeColor: ColorValue, rule: RuleValue): this.type = js.native
    def fillAndStroke(fillColor: ColorValue): this.type = js.native
    def fillAndStroke(fillColor: ColorValue, rule: RuleValue): this.type = js.native
    def fillAndStroke(fillColor: ColorValue, strokeColor: Unit, rule: RuleValue): this.type = js.native
    def fillAndStroke(fillColor: ColorValue, strokeColor: ColorValue): this.type = js.native
    def fillAndStroke(fillColor: ColorValue, strokeColor: ColorValue, rule: RuleValue): this.type = js.native
    def fillAndStroke(rule: RuleValue): this.type = js.native
    
    def lineCap(c: String): this.type = js.native
    
    def lineJoin(j: String): this.type = js.native
    
    def lineTo(x: Double, y: Double): this.type = js.native
    
    def lineWidth(w: Double): this.type = js.native
    
    def miterLimit(m: Any): this.type = js.native
    
    def moveTo(x: Double, y: Double): this.type = js.native
    
    def path(path: String): this.type = js.native
    
    def polygon(points: js.Array[Double]*): this.type = js.native
    
    def quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double): this.type = js.native
    
    def rect(x: Double, y: Double, w: Double, h: Double): this.type = js.native
    
    def restore(): this.type = js.native
    
    def rotate(angle: Double): this.type = js.native
    def rotate(angle: Double, options: Origin): this.type = js.native
    
    def roundedRect(x: Double, y: Double, w: Double, h: Double): this.type = js.native
    def roundedRect(x: Double, y: Double, w: Double, h: Double, r: Double): this.type = js.native
    
    def save(): this.type = js.native
    
    def scale(xFactor: Double): this.type = js.native
    def scale(xFactor: Double, yFactor: Double): this.type = js.native
    def scale(xFactor: Double, yFactor: Double, options: Origin): this.type = js.native
    def scale(xFactor: Double, yFactor: Unit, options: Origin): this.type = js.native
    
    def stroke(): this.type = js.native
    def stroke(color: ColorValue): this.type = js.native
    
    def transform(m11: Double, m12: Double, m21: Double, m22: Double, dx: Double, dy: Double): this.type = js.native
    
    def translate(x: Double, y: Double): this.type = js.native
    
    def undash(): this.type = js.native
  }
  
  trait PageMarking extends StObject {
    
    var options: js.UndefOr[MarkingOptions] = js.undefined
    
    var structContent: js.UndefOr[PDFStructureContent] = js.undefined
    
    var tag: String
  }
  object PageMarking {
    
    inline def apply(tag: String): PageMarking = {
      val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageMarking]
    }
    
    extension [Self <: PageMarking](x: Self) {
      
      inline def setOptions(value: MarkingOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setStructContent(value: PDFStructureContent): Self = StObject.set(x, "structContent", value.asInstanceOf[js.Any])
      
      inline def setStructContentUndefined: Self = StObject.set(x, "structContent", js.undefined)
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  // The winding / filling rule accepted by PDFKit:
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.pdfkit.pdfkitStrings.`even-odd`
    - typingsJapgolly.pdfkit.pdfkitStrings.evenodd
    - typingsJapgolly.pdfkit.pdfkitStrings.`non-zero`
    - typingsJapgolly.pdfkit.pdfkitStrings.nonzero
  */
  trait RuleValue extends StObject
  object RuleValue {
    
    inline def `even-odd`: typingsJapgolly.pdfkit.pdfkitStrings.`even-odd` = "even-odd".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.`even-odd`]
    
    inline def evenodd: typingsJapgolly.pdfkit.pdfkitStrings.evenodd = "evenodd".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.evenodd]
    
    inline def `non-zero`: typingsJapgolly.pdfkit.pdfkitStrings.`non-zero` = "non-zero".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.`non-zero`]
    
    inline def nonzero: typingsJapgolly.pdfkit.pdfkitStrings.nonzero = "nonzero".asInstanceOf[typingsJapgolly.pdfkit.pdfkitStrings.nonzero]
  }
  
  trait TextOptions extends StObject {
    
    /** The alignment of the text (center, justify, left, right) */
    //TODO check this
    var align: js.UndefOr[center | justify | left | right | String] = js.undefined
    
    /** The vertical alignment of the text with respect to its insertion point */
    var baseline: js.UndefOr[
        Double | `svg-middle` | middle | `svg-central` | bottom | ideographic | alphabetic | mathematical | hanging | top
      ] = js.undefined
    
    /** The indent of bullet points in a list */
    var bulletIndent: js.UndefOr[Double] = js.undefined
    
    /** The radius of bullet points in a list. Works only with listType: 'bullet' */
    var bulletRadius: js.UndefOr[Double] = js.undefined
    
    /** The amount of space between each character in the text */
    var characterSpacing: js.UndefOr[Double] = js.undefined
    
    /** The amount of space between each column (1/4 inch by default) */
    var columnGap: js.UndefOr[Double] = js.undefined
    
    /** The number of columns to flow the text into */
    var columns: js.UndefOr[Double] = js.undefined
    
    /** Whether the text segment will be followed immediately by another segment. Useful for changing styling in the middle of a paragraph. */
    var continued: js.UndefOr[Boolean] = js.undefined
    
    var destination: js.UndefOr[String] = js.undefined
    
    /** The character to display at the end of the text when it is too long. Set to true to use the default character. */
    var ellipsis: js.UndefOr[Boolean | String] = js.undefined
    
    /** An array of OpenType feature tags to apply. If not provided, a set of defaults is used. */
    var features: js.UndefOr[js.Array[OpenTypeFeatures]] = js.undefined
    
    /** Whether to fill the text (true by default) */
    var fill: js.UndefOr[Boolean] = js.undefined
    
    var goTo: js.UndefOr[String] = js.undefined
    
    /** The maximum height that text should be clipped to */
    var height: js.UndefOr[Double] = js.undefined
    
    /** The amount in PDF points (72 per inch) to indent each paragraph of text */
    var indent: js.UndefOr[Double] = js.undefined
    
    /** Set to false to disable line wrapping all together */
    var lineBreak: js.UndefOr[Boolean] = js.undefined
    
    /** The amount of space between each line of text */
    var lineGap: js.UndefOr[Double] = js.undefined
    
    /** A URL to link this text to (shortcut to create an annotation) */
    var link: js.UndefOr[String] = js.undefined
    
    /** Sets a list as unordered, ordered or lettered */
    var listType: js.UndefOr[bullet | numbered | lettered] = js.undefined
    
    /** Whether to slant the text (angle in degrees or true) */
    var oblique: js.UndefOr[Boolean | Double] = js.undefined
    
    /** The amount of space between each paragraph of text */
    var paragraphGap: js.UndefOr[Double] = js.undefined
    
    /** Whether to strike out the text */
    var strike: js.UndefOr[Boolean] = js.undefined
    
    /** Whether to stroke the text */
    var stroke: js.UndefOr[Boolean] = js.undefined
    
    /** The indent of text in a list */
    var textIndent: js.UndefOr[Double] = js.undefined
    
    /** Whether to underline the text */
    var underline: js.UndefOr[Boolean] = js.undefined
    
    /** The width that text should be wrapped to (by default, the page width minus the left and right margin) */
    var width: js.UndefOr[Double] = js.undefined
    
    /** The amount of space between each word in the text */
    var wordSpacing: js.UndefOr[Double] = js.undefined
  }
  object TextOptions {
    
    inline def apply(): TextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextOptions]
    }
    
    extension [Self <: TextOptions](x: Self) {
      
      inline def setAlign(value: center | justify | left | right | String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setBaseline(
        value: Double | `svg-middle` | middle | `svg-central` | bottom | ideographic | alphabetic | mathematical | hanging | top
      ): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
      
      inline def setBaselineUndefined: Self = StObject.set(x, "baseline", js.undefined)
      
      inline def setBulletIndent(value: Double): Self = StObject.set(x, "bulletIndent", value.asInstanceOf[js.Any])
      
      inline def setBulletIndentUndefined: Self = StObject.set(x, "bulletIndent", js.undefined)
      
      inline def setBulletRadius(value: Double): Self = StObject.set(x, "bulletRadius", value.asInstanceOf[js.Any])
      
      inline def setBulletRadiusUndefined: Self = StObject.set(x, "bulletRadius", js.undefined)
      
      inline def setCharacterSpacing(value: Double): Self = StObject.set(x, "characterSpacing", value.asInstanceOf[js.Any])
      
      inline def setCharacterSpacingUndefined: Self = StObject.set(x, "characterSpacing", js.undefined)
      
      inline def setColumnGap(value: Double): Self = StObject.set(x, "columnGap", value.asInstanceOf[js.Any])
      
      inline def setColumnGapUndefined: Self = StObject.set(x, "columnGap", js.undefined)
      
      inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setContinued(value: Boolean): Self = StObject.set(x, "continued", value.asInstanceOf[js.Any])
      
      inline def setContinuedUndefined: Self = StObject.set(x, "continued", js.undefined)
      
      inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
      
      inline def setEllipsis(value: Boolean | String): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      inline def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      inline def setFeatures(value: js.Array[OpenTypeFeatures]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
      
      inline def setFeaturesVarargs(value: OpenTypeFeatures*): Self = StObject.set(x, "features", js.Array(value*))
      
      inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setGoTo(value: String): Self = StObject.set(x, "goTo", value.asInstanceOf[js.Any])
      
      inline def setGoToUndefined: Self = StObject.set(x, "goTo", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setLineBreak(value: Boolean): Self = StObject.set(x, "lineBreak", value.asInstanceOf[js.Any])
      
      inline def setLineBreakUndefined: Self = StObject.set(x, "lineBreak", js.undefined)
      
      inline def setLineGap(value: Double): Self = StObject.set(x, "lineGap", value.asInstanceOf[js.Any])
      
      inline def setLineGapUndefined: Self = StObject.set(x, "lineGap", js.undefined)
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setListType(value: bullet | numbered | lettered): Self = StObject.set(x, "listType", value.asInstanceOf[js.Any])
      
      inline def setListTypeUndefined: Self = StObject.set(x, "listType", js.undefined)
      
      inline def setOblique(value: Boolean | Double): Self = StObject.set(x, "oblique", value.asInstanceOf[js.Any])
      
      inline def setObliqueUndefined: Self = StObject.set(x, "oblique", js.undefined)
      
      inline def setParagraphGap(value: Double): Self = StObject.set(x, "paragraphGap", value.asInstanceOf[js.Any])
      
      inline def setParagraphGapUndefined: Self = StObject.set(x, "paragraphGap", js.undefined)
      
      inline def setStrike(value: Boolean): Self = StObject.set(x, "strike", value.asInstanceOf[js.Any])
      
      inline def setStrikeUndefined: Self = StObject.set(x, "strike", js.undefined)
      
      inline def setStroke(value: Boolean): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      inline def setTextIndent(value: Double): Self = StObject.set(x, "textIndent", value.asInstanceOf[js.Any])
      
      inline def setTextIndentUndefined: Self = StObject.set(x, "textIndent", js.undefined)
      
      inline def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
      
      inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWordSpacing(value: Double): Self = StObject.set(x, "wordSpacing", value.asInstanceOf[js.Any])
      
      inline def setWordSpacingUndefined: Self = StObject.set(x, "wordSpacing", js.undefined)
    }
  }
}
