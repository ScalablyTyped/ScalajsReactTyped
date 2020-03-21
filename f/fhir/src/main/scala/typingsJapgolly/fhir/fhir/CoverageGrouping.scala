package typingsJapgolly.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional coverage classifications
  */
trait CoverageGrouping extends BackboneElement {
  /**
    * Contains extended information for property 'class'.
    */
  var _class: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'classDisplay'.
    */
  var _classDisplay: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'group'.
    */
  var _group: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'groupDisplay'.
    */
  var _groupDisplay: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'plan'.
    */
  var _plan: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'planDisplay'.
    */
  var _planDisplay: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'subClass'.
    */
  var _subClass: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'subClassDisplay'.
    */
  var _subClassDisplay: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'subGroup'.
    */
  var _subGroup: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'subGroupDisplay'.
    */
  var _subGroupDisplay: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'subPlan'.
    */
  var _subPlan: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'subPlanDisplay'.
    */
  var _subPlanDisplay: js.UndefOr[Element] = js.undefined
  /**
    * An identifier for the class
    */
  var `class`: js.UndefOr[String] = js.undefined
  /**
    * Display text for the class
    */
  var classDisplay: js.UndefOr[String] = js.undefined
  /**
    * An identifier for the group
    */
  var group: js.UndefOr[String] = js.undefined
  /**
    * Display text for an identifier for the group
    */
  var groupDisplay: js.UndefOr[String] = js.undefined
  /**
    * An identifier for the plan
    */
  var plan: js.UndefOr[String] = js.undefined
  /**
    * Display text for the plan
    */
  var planDisplay: js.UndefOr[String] = js.undefined
  /**
    * An identifier for the subsection of the class
    */
  var subClass: js.UndefOr[String] = js.undefined
  /**
    * Display text for the subsection of the subclass
    */
  var subClassDisplay: js.UndefOr[String] = js.undefined
  /**
    * An identifier for the subsection of the group
    */
  var subGroup: js.UndefOr[String] = js.undefined
  /**
    * Display text for the subsection of the group
    */
  var subGroupDisplay: js.UndefOr[String] = js.undefined
  /**
    * An identifier for the subsection of the plan
    */
  var subPlan: js.UndefOr[String] = js.undefined
  /**
    * Display text for the subsection of the plan
    */
  var subPlanDisplay: js.UndefOr[String] = js.undefined
}

object CoverageGrouping {
  @scala.inline
  def apply(
    _class: Element = null,
    _classDisplay: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _group: Element = null,
    _groupDisplay: Element = null,
    _id: Element = null,
    _plan: Element = null,
    _planDisplay: Element = null,
    _subClass: Element = null,
    _subClassDisplay: Element = null,
    _subGroup: Element = null,
    _subGroupDisplay: Element = null,
    _subPlan: Element = null,
    _subPlanDisplay: Element = null,
    `class`: String = null,
    classDisplay: String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    group: String = null,
    groupDisplay: String = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    plan: String = null,
    planDisplay: String = null,
    subClass: String = null,
    subClassDisplay: String = null,
    subGroup: String = null,
    subGroupDisplay: String = null,
    subPlan: String = null,
    subPlanDisplay: String = null
  ): CoverageGrouping = {
    val __obj = js.Dynamic.literal()
    if (_class != null) __obj.updateDynamic("_class")(_class.asInstanceOf[js.Any])
    if (_classDisplay != null) __obj.updateDynamic("_classDisplay")(_classDisplay.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_group != null) __obj.updateDynamic("_group")(_group.asInstanceOf[js.Any])
    if (_groupDisplay != null) __obj.updateDynamic("_groupDisplay")(_groupDisplay.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_plan != null) __obj.updateDynamic("_plan")(_plan.asInstanceOf[js.Any])
    if (_planDisplay != null) __obj.updateDynamic("_planDisplay")(_planDisplay.asInstanceOf[js.Any])
    if (_subClass != null) __obj.updateDynamic("_subClass")(_subClass.asInstanceOf[js.Any])
    if (_subClassDisplay != null) __obj.updateDynamic("_subClassDisplay")(_subClassDisplay.asInstanceOf[js.Any])
    if (_subGroup != null) __obj.updateDynamic("_subGroup")(_subGroup.asInstanceOf[js.Any])
    if (_subGroupDisplay != null) __obj.updateDynamic("_subGroupDisplay")(_subGroupDisplay.asInstanceOf[js.Any])
    if (_subPlan != null) __obj.updateDynamic("_subPlan")(_subPlan.asInstanceOf[js.Any])
    if (_subPlanDisplay != null) __obj.updateDynamic("_subPlanDisplay")(_subPlanDisplay.asInstanceOf[js.Any])
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (classDisplay != null) __obj.updateDynamic("classDisplay")(classDisplay.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (groupDisplay != null) __obj.updateDynamic("groupDisplay")(groupDisplay.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (plan != null) __obj.updateDynamic("plan")(plan.asInstanceOf[js.Any])
    if (planDisplay != null) __obj.updateDynamic("planDisplay")(planDisplay.asInstanceOf[js.Any])
    if (subClass != null) __obj.updateDynamic("subClass")(subClass.asInstanceOf[js.Any])
    if (subClassDisplay != null) __obj.updateDynamic("subClassDisplay")(subClassDisplay.asInstanceOf[js.Any])
    if (subGroup != null) __obj.updateDynamic("subGroup")(subGroup.asInstanceOf[js.Any])
    if (subGroupDisplay != null) __obj.updateDynamic("subGroupDisplay")(subGroupDisplay.asInstanceOf[js.Any])
    if (subPlan != null) __obj.updateDynamic("subPlan")(subPlan.asInstanceOf[js.Any])
    if (subPlanDisplay != null) __obj.updateDynamic("subPlanDisplay")(subPlanDisplay.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageGrouping]
  }
}

