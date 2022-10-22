package typingsJapgolly.stringStripHtml

import japgolly.scalajs.react.Callback
import typingsJapgolly.stringStripHtml.anon.Enabled
import typingsJapgolly.stringStripHtml.anon.PartialOpts
import typingsJapgolly.stringStripHtml.anon.PutOnNewLine
import typingsJapgolly.stringStripHtml.anon.TimeTakenInMilliseconds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("string-strip-html", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object defaults {
    
    @JSImport("string-strip-html", "defaults")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("string-strip-html", "defaults.cb")
    @js.native
    def cb: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
    inline def cb_=(x: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cb")(x.asInstanceOf[js.Any])
    
    @JSImport("string-strip-html", "defaults.dumpLinkHrefsNearby")
    @js.native
    def dumpLinkHrefsNearby: PutOnNewLine = js.native
    inline def dumpLinkHrefsNearby_=(x: PutOnNewLine): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dumpLinkHrefsNearby")(x.asInstanceOf[js.Any])
    
    @JSImport("string-strip-html", "defaults.ignoreTags")
    @js.native
    def ignoreTags: js.Array[scala.Nothing] = js.native
    
    @JSImport("string-strip-html", "defaults.ignoreTagsWithTheirContents")
    @js.native
    def ignoreTagsWithTheirContents: js.Array[scala.Nothing] = js.native
    inline def ignoreTagsWithTheirContents_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ignoreTagsWithTheirContents")(x.asInstanceOf[js.Any])
    
    inline def ignoreTags_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ignoreTags")(x.asInstanceOf[js.Any])
    
    @JSImport("string-strip-html", "defaults.onlyStripTags")
    @js.native
    def onlyStripTags: js.Array[scala.Nothing] = js.native
    inline def onlyStripTags_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onlyStripTags")(x.asInstanceOf[js.Any])
    
    @JSImport("string-strip-html", "defaults.reportProgressFunc")
    @js.native
    def reportProgressFunc: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
    
    @JSImport("string-strip-html", "defaults.reportProgressFuncFrom")
    @js.native
    def reportProgressFuncFrom: Double = js.native
    inline def reportProgressFuncFrom_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reportProgressFuncFrom")(x.asInstanceOf[js.Any])
    
    @JSImport("string-strip-html", "defaults.reportProgressFuncTo")
    @js.native
    def reportProgressFuncTo: Double = js.native
    inline def reportProgressFuncTo_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reportProgressFuncTo")(x.asInstanceOf[js.Any])
    
    inline def reportProgressFunc_=(x: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reportProgressFunc")(x.asInstanceOf[js.Any])
    
    @JSImport("string-strip-html", "defaults.skipHtmlDecoding")
    @js.native
    def skipHtmlDecoding: Boolean = js.native
    inline def skipHtmlDecoding_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skipHtmlDecoding")(x.asInstanceOf[js.Any])
    
    @JSImport("string-strip-html", "defaults.stripRecognisedHTMLOnly")
    @js.native
    def stripRecognisedHTMLOnly: Boolean = js.native
    inline def stripRecognisedHTMLOnly_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stripRecognisedHTMLOnly")(x.asInstanceOf[js.Any])
    
    @JSImport("string-strip-html", "defaults.stripTogetherWithTheirContents")
    @js.native
    def stripTogetherWithTheirContents: js.Array[String] = js.native
    inline def stripTogetherWithTheirContents_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stripTogetherWithTheirContents")(x.asInstanceOf[js.Any])
    
    @JSImport("string-strip-html", "defaults.trimOnlySpaces")
    @js.native
    def trimOnlySpaces: Boolean = js.native
    inline def trimOnlySpaces_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trimOnlySpaces")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Strips HTML tags from strings. No parser, accepts mixed sources.
    */
  inline def stripHtml(str: String): Res = ^.asInstanceOf[js.Dynamic].applyDynamic("stripHtml")(str.asInstanceOf[js.Any]).asInstanceOf[Res]
  inline def stripHtml(str: String, opts: PartialOpts): Res = (^.asInstanceOf[js.Dynamic].applyDynamic("stripHtml")(str.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Res]
  
  @JSImport("string-strip-html", "version")
  @js.native
  val version: String = js.native
  
  trait Attribute extends StObject {
    
    var equalsAt: js.UndefOr[Double] = js.undefined
    
    var name: String
    
    var nameEnds: Double
    
    var nameStarts: Double
    
    var value: js.UndefOr[String] = js.undefined
    
    var valueEnds: js.UndefOr[Double] = js.undefined
    
    var valueStarts: js.UndefOr[Double] = js.undefined
  }
  object Attribute {
    
    inline def apply(name: String, nameEnds: Double, nameStarts: Double): Attribute = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nameEnds = nameEnds.asInstanceOf[js.Any], nameStarts = nameStarts.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attribute]
    }
    
    extension [Self <: Attribute](x: Self) {
      
      inline def setEqualsAt(value: Double): Self = StObject.set(x, "equalsAt", value.asInstanceOf[js.Any])
      
      inline def setEqualsAtUndefined: Self = StObject.set(x, "equalsAt", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameEnds(value: Double): Self = StObject.set(x, "nameEnds", value.asInstanceOf[js.Any])
      
      inline def setNameStarts(value: Double): Self = StObject.set(x, "nameStarts", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueEnds(value: Double): Self = StObject.set(x, "valueEnds", value.asInstanceOf[js.Any])
      
      inline def setValueEndsUndefined: Self = StObject.set(x, "valueEnds", js.undefined)
      
      inline def setValueStarts(value: Double): Self = StObject.set(x, "valueStarts", value.asInstanceOf[js.Any])
      
      inline def setValueStartsUndefined: Self = StObject.set(x, "valueStarts", js.undefined)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait CbObj extends StObject {
    
    var deleteFrom: Null | Double
    
    var deleteTo: Null | Double
    
    var insert: js.UndefOr[Null | String] = js.undefined
    
    var proposedReturn: Range | Null
    
    var rangesArr: typingsJapgolly.rangesPush.mod.Ranges
    
    var tag: Tag
  }
  object CbObj {
    
    inline def apply(rangesArr: typingsJapgolly.rangesPush.mod.Ranges, tag: Tag): CbObj = {
      val __obj = js.Dynamic.literal(rangesArr = rangesArr.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], deleteFrom = null, deleteTo = null, proposedReturn = null)
      __obj.asInstanceOf[CbObj]
    }
    
    extension [Self <: CbObj](x: Self) {
      
      inline def setDeleteFrom(value: Double): Self = StObject.set(x, "deleteFrom", value.asInstanceOf[js.Any])
      
      inline def setDeleteFromNull: Self = StObject.set(x, "deleteFrom", null)
      
      inline def setDeleteTo(value: Double): Self = StObject.set(x, "deleteTo", value.asInstanceOf[js.Any])
      
      inline def setDeleteToNull: Self = StObject.set(x, "deleteTo", null)
      
      inline def setInsert(value: String): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
      
      inline def setInsertNull: Self = StObject.set(x, "insert", null)
      
      inline def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
      
      inline def setProposedReturn(value: Range): Self = StObject.set(x, "proposedReturn", value.asInstanceOf[js.Any])
      
      inline def setProposedReturnNull: Self = StObject.set(x, "proposedReturn", null)
      
      inline def setRangesArr(value: typingsJapgolly.rangesPush.mod.Ranges): Self = StObject.set(x, "rangesArr", value.asInstanceOf[js.Any])
      
      inline def setTag(value: Tag): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  trait Opts extends StObject {
    
    var cb: Null | (js.Function1[/* cbObj */ CbObj, Unit])
    
    var dumpLinkHrefsNearby: Enabled
    
    var ignoreTags: js.Array[String]
    
    var ignoreTagsWithTheirContents: js.Array[String]
    
    var onlyStripTags: js.Array[String]
    
    var reportProgressFunc: Null | (js.Function1[/* percDone */ Double, Unit])
    
    var reportProgressFuncFrom: Double
    
    var reportProgressFuncTo: Double
    
    var skipHtmlDecoding: Boolean
    
    var stripRecognisedHTMLOnly: Boolean
    
    var stripTogetherWithTheirContents: js.Array[String]
    
    var trimOnlySpaces: Boolean
  }
  object Opts {
    
    inline def apply(
      dumpLinkHrefsNearby: Enabled,
      ignoreTags: js.Array[String],
      ignoreTagsWithTheirContents: js.Array[String],
      onlyStripTags: js.Array[String],
      reportProgressFuncFrom: Double,
      reportProgressFuncTo: Double,
      skipHtmlDecoding: Boolean,
      stripRecognisedHTMLOnly: Boolean,
      stripTogetherWithTheirContents: js.Array[String],
      trimOnlySpaces: Boolean
    ): Opts = {
      val __obj = js.Dynamic.literal(dumpLinkHrefsNearby = dumpLinkHrefsNearby.asInstanceOf[js.Any], ignoreTags = ignoreTags.asInstanceOf[js.Any], ignoreTagsWithTheirContents = ignoreTagsWithTheirContents.asInstanceOf[js.Any], onlyStripTags = onlyStripTags.asInstanceOf[js.Any], reportProgressFuncFrom = reportProgressFuncFrom.asInstanceOf[js.Any], reportProgressFuncTo = reportProgressFuncTo.asInstanceOf[js.Any], skipHtmlDecoding = skipHtmlDecoding.asInstanceOf[js.Any], stripRecognisedHTMLOnly = stripRecognisedHTMLOnly.asInstanceOf[js.Any], stripTogetherWithTheirContents = stripTogetherWithTheirContents.asInstanceOf[js.Any], trimOnlySpaces = trimOnlySpaces.asInstanceOf[js.Any], cb = null, reportProgressFunc = null)
      __obj.asInstanceOf[Opts]
    }
    
    extension [Self <: Opts](x: Self) {
      
      inline def setCb(value: /* cbObj */ CbObj => Callback): Self = StObject.set(x, "cb", js.Any.fromFunction1((t0: /* cbObj */ CbObj) => value(t0).runNow()))
      
      inline def setCbNull: Self = StObject.set(x, "cb", null)
      
      inline def setDumpLinkHrefsNearby(value: Enabled): Self = StObject.set(x, "dumpLinkHrefsNearby", value.asInstanceOf[js.Any])
      
      inline def setIgnoreTags(value: js.Array[String]): Self = StObject.set(x, "ignoreTags", value.asInstanceOf[js.Any])
      
      inline def setIgnoreTagsVarargs(value: String*): Self = StObject.set(x, "ignoreTags", js.Array(value*))
      
      inline def setIgnoreTagsWithTheirContents(value: js.Array[String]): Self = StObject.set(x, "ignoreTagsWithTheirContents", value.asInstanceOf[js.Any])
      
      inline def setIgnoreTagsWithTheirContentsVarargs(value: String*): Self = StObject.set(x, "ignoreTagsWithTheirContents", js.Array(value*))
      
      inline def setOnlyStripTags(value: js.Array[String]): Self = StObject.set(x, "onlyStripTags", value.asInstanceOf[js.Any])
      
      inline def setOnlyStripTagsVarargs(value: String*): Self = StObject.set(x, "onlyStripTags", js.Array(value*))
      
      inline def setReportProgressFunc(value: /* percDone */ Double => Callback): Self = StObject.set(x, "reportProgressFunc", js.Any.fromFunction1((t0: /* percDone */ Double) => value(t0).runNow()))
      
      inline def setReportProgressFuncFrom(value: Double): Self = StObject.set(x, "reportProgressFuncFrom", value.asInstanceOf[js.Any])
      
      inline def setReportProgressFuncNull: Self = StObject.set(x, "reportProgressFunc", null)
      
      inline def setReportProgressFuncTo(value: Double): Self = StObject.set(x, "reportProgressFuncTo", value.asInstanceOf[js.Any])
      
      inline def setSkipHtmlDecoding(value: Boolean): Self = StObject.set(x, "skipHtmlDecoding", value.asInstanceOf[js.Any])
      
      inline def setStripRecognisedHTMLOnly(value: Boolean): Self = StObject.set(x, "stripRecognisedHTMLOnly", value.asInstanceOf[js.Any])
      
      inline def setStripTogetherWithTheirContents(value: js.Array[String]): Self = StObject.set(x, "stripTogetherWithTheirContents", value.asInstanceOf[js.Any])
      
      inline def setStripTogetherWithTheirContentsVarargs(value: String*): Self = StObject.set(x, "stripTogetherWithTheirContents", js.Array(value*))
      
      inline def setTrimOnlySpaces(value: Boolean): Self = StObject.set(x, "trimOnlySpaces", value.asInstanceOf[js.Any])
    }
  }
  
  type Range = (js.Tuple2[/* from */ Double, /* to */ Double]) | (js.Tuple3[/* from */ Double, /* to */ Double, /* whatToInsert */ js.UndefOr[String | Null]])
  
  type Ranges = js.Array[Range] | Null
  
  trait Res extends StObject {
    
    var allTagLocations: js.Array[js.Tuple2[Double, Double]]
    
    var filteredTagLocations: js.Array[js.Tuple2[Double, Double]]
    
    var log: TimeTakenInMilliseconds
    
    var ranges: Ranges
    
    var result: String
  }
  object Res {
    
    inline def apply(
      allTagLocations: js.Array[js.Tuple2[Double, Double]],
      filteredTagLocations: js.Array[js.Tuple2[Double, Double]],
      log: TimeTakenInMilliseconds,
      result: String
    ): Res = {
      val __obj = js.Dynamic.literal(allTagLocations = allTagLocations.asInstanceOf[js.Any], filteredTagLocations = filteredTagLocations.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], ranges = null)
      __obj.asInstanceOf[Res]
    }
    
    extension [Self <: Res](x: Self) {
      
      inline def setAllTagLocations(value: js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "allTagLocations", value.asInstanceOf[js.Any])
      
      inline def setAllTagLocationsVarargs(value: (js.Tuple2[Double, Double])*): Self = StObject.set(x, "allTagLocations", js.Array(value*))
      
      inline def setFilteredTagLocations(value: js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "filteredTagLocations", value.asInstanceOf[js.Any])
      
      inline def setFilteredTagLocationsVarargs(value: (js.Tuple2[Double, Double])*): Self = StObject.set(x, "filteredTagLocations", js.Array(value*))
      
      inline def setLog(value: TimeTakenInMilliseconds): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setRanges(value: Ranges): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      inline def setRangesNull: Self = StObject.set(x, "ranges", null)
      
      inline def setRangesVarargs(value: Range*): Self = StObject.set(x, "ranges", js.Array(value*))
      
      inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  trait Tag extends StObject {
    
    var attributes: js.Array[Attribute]
    
    var lastClosingBracketAt: Double
    
    var lastOpeningBracketAt: Double
    
    var leftOuterWhitespace: Double
    
    var name: String
    
    var nameContainsLetters: Boolean
    
    var nameEnds: Double
    
    var nameStarts: Double
    
    var onlyPlausible: Boolean
    
    var slashPresent: Double
  }
  object Tag {
    
    inline def apply(
      attributes: js.Array[Attribute],
      lastClosingBracketAt: Double,
      lastOpeningBracketAt: Double,
      leftOuterWhitespace: Double,
      name: String,
      nameContainsLetters: Boolean,
      nameEnds: Double,
      nameStarts: Double,
      onlyPlausible: Boolean,
      slashPresent: Double
    ): Tag = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], lastClosingBracketAt = lastClosingBracketAt.asInstanceOf[js.Any], lastOpeningBracketAt = lastOpeningBracketAt.asInstanceOf[js.Any], leftOuterWhitespace = leftOuterWhitespace.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameContainsLetters = nameContainsLetters.asInstanceOf[js.Any], nameEnds = nameEnds.asInstanceOf[js.Any], nameStarts = nameStarts.asInstanceOf[js.Any], onlyPlausible = onlyPlausible.asInstanceOf[js.Any], slashPresent = slashPresent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tag]
    }
    
    extension [Self <: Tag](x: Self) {
      
      inline def setAttributes(value: js.Array[Attribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "attributes", js.Array(value*))
      
      inline def setLastClosingBracketAt(value: Double): Self = StObject.set(x, "lastClosingBracketAt", value.asInstanceOf[js.Any])
      
      inline def setLastOpeningBracketAt(value: Double): Self = StObject.set(x, "lastOpeningBracketAt", value.asInstanceOf[js.Any])
      
      inline def setLeftOuterWhitespace(value: Double): Self = StObject.set(x, "leftOuterWhitespace", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameContainsLetters(value: Boolean): Self = StObject.set(x, "nameContainsLetters", value.asInstanceOf[js.Any])
      
      inline def setNameEnds(value: Double): Self = StObject.set(x, "nameEnds", value.asInstanceOf[js.Any])
      
      inline def setNameStarts(value: Double): Self = StObject.set(x, "nameStarts", value.asInstanceOf[js.Any])
      
      inline def setOnlyPlausible(value: Boolean): Self = StObject.set(x, "onlyPlausible", value.asInstanceOf[js.Any])
      
      inline def setSlashPresent(value: Double): Self = StObject.set(x, "slashPresent", value.asInstanceOf[js.Any])
    }
  }
}
