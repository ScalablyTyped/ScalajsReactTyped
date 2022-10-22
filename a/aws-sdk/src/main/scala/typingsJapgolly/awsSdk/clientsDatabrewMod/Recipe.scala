package typingsJapgolly.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Recipe extends StObject {
  
  /**
    * The date and time that the recipe was created.
    */
  var CreateDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the user who created the recipe.
    */
  var CreatedBy: js.UndefOr[typingsJapgolly.awsSdk.clientsDatabrewMod.CreatedBy] = js.undefined
  
  /**
    * The description of the recipe.
    */
  var Description: js.UndefOr[RecipeDescription] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the user who last modified the recipe.
    */
  var LastModifiedBy: js.UndefOr[typingsJapgolly.awsSdk.clientsDatabrewMod.LastModifiedBy] = js.undefined
  
  /**
    * The last modification date and time of the recipe.
    */
  var LastModifiedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The unique name for the recipe.
    */
  var Name: RecipeName
  
  /**
    * The name of the project that the recipe is associated with.
    */
  var ProjectName: js.UndefOr[typingsJapgolly.awsSdk.clientsDatabrewMod.ProjectName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the user who published the recipe.
    */
  var PublishedBy: js.UndefOr[typingsJapgolly.awsSdk.clientsDatabrewMod.PublishedBy] = js.undefined
  
  /**
    * The date and time when the recipe was published.
    */
  var PublishedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The identifier for the version for the recipe. Must be one of the following:   Numeric version (X.Y) - X and Y stand for major and minor version numbers. The maximum length of each is 6 digits, and neither can be negative values. Both X and Y are required, and "0.0" isn't a valid version.    LATEST_WORKING - the most recent valid version being developed in a DataBrew project.    LATEST_PUBLISHED - the most recent published version.  
    */
  var RecipeVersion: js.UndefOr[typingsJapgolly.awsSdk.clientsDatabrewMod.RecipeVersion] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the recipe.
    */
  var ResourceArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * A list of steps that are defined by the recipe.
    */
  var Steps: js.UndefOr[RecipeStepList] = js.undefined
  
  /**
    * Metadata tags that have been applied to the recipe.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object Recipe {
  
  inline def apply(Name: RecipeName): Recipe = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recipe]
  }
  
  extension [Self <: Recipe](x: Self) {
    
    inline def setCreateDate(value: js.Date): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    inline def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    inline def setCreatedBy(value: CreatedBy): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    inline def setDescription(value: RecipeDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLastModifiedBy(value: LastModifiedBy): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "LastModifiedBy", js.undefined)
    
    inline def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    inline def setName(value: RecipeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setProjectName(value: ProjectName): Self = StObject.set(x, "ProjectName", value.asInstanceOf[js.Any])
    
    inline def setProjectNameUndefined: Self = StObject.set(x, "ProjectName", js.undefined)
    
    inline def setPublishedBy(value: PublishedBy): Self = StObject.set(x, "PublishedBy", value.asInstanceOf[js.Any])
    
    inline def setPublishedByUndefined: Self = StObject.set(x, "PublishedBy", js.undefined)
    
    inline def setPublishedDate(value: js.Date): Self = StObject.set(x, "PublishedDate", value.asInstanceOf[js.Any])
    
    inline def setPublishedDateUndefined: Self = StObject.set(x, "PublishedDate", js.undefined)
    
    inline def setRecipeVersion(value: RecipeVersion): Self = StObject.set(x, "RecipeVersion", value.asInstanceOf[js.Any])
    
    inline def setRecipeVersionUndefined: Self = StObject.set(x, "RecipeVersion", js.undefined)
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    inline def setSteps(value: RecipeStepList): Self = StObject.set(x, "Steps", value.asInstanceOf[js.Any])
    
    inline def setStepsUndefined: Self = StObject.set(x, "Steps", js.undefined)
    
    inline def setStepsVarargs(value: RecipeStep*): Self = StObject.set(x, "Steps", js.Array(value*))
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
