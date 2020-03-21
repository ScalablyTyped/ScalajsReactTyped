package typingsJapgolly.rrule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rrule/dist/esm/src/rruleset", JSImport.Namespace)
@js.native
object rrulesetMod extends js.Object {
  @js.native
  trait RRuleSet
    extends typingsJapgolly.rrule.rruleMod.default {
    var _dtstart: js.UndefOr[js.Any] = js.native
    val _exdate: js.Array[js.Date] = js.native
    val _exrule: js.Array[typingsJapgolly.rrule.rruleMod.default] = js.native
    val _rdate: js.Array[js.Date] = js.native
    val _rrule: js.Array[typingsJapgolly.rrule.rruleMod.default] = js.native
    var _tzid: js.UndefOr[js.Any] = js.native
    var dtstart: js.Any = js.native
    var tzid: js.Any = js.native
    /**
      * Adds an EXDATE to the set
      *
      * @param {Date}
      */
    def exdate(date: js.Date): Unit = js.native
    /**
      * Get list of included datetimes in this recurrence set.
      *
      * @return List of exdates
      */
    def exdates(): js.Array[js.Date] = js.native
    /**
      * Adds an EXRULE to the set
      *
      * @param {RRule}
      */
    def exrule(rrule: typingsJapgolly.rrule.rruleMod.default): Unit = js.native
    /**
      * Get list of excluded rrules in this recurrence set.
      *
      * @return List of exrules
      */
    def exrules(): js.Array[typingsJapgolly.rrule.rruleMod.default | RRuleSet] = js.native
    /**
      * Adds an RDate to the set
      *
      * @param {Date}
      */
    def rdate(date: js.Date): Unit = js.native
    /**
      * Get list of included datetimes in this recurrence set.
      *
      * @return List of rdates
      */
    def rdates(): js.Array[js.Date] = js.native
    /**
      * Adds an RRule to the set
      *
      * @param {RRule}
      */
    def rrule(rrule: typingsJapgolly.rrule.rruleMod.default): Unit = js.native
    /**
      * Get list of included rrules in this recurrence set.
      *
      * @return List of rrules
      */
    def rrules(): js.Array[typingsJapgolly.rrule.rruleMod.default | RRuleSet] = js.native
  }
  
  @js.native
  /**
    *
    * @param {Boolean?} noCache
    *  The same stratagy as RRule on cache, default to false
    * @constructor
    */
  class default () extends RRuleSet {
    def this(noCache: Boolean) = this()
  }
  
}

