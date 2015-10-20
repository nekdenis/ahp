/**
 *
 * $Id$
 */
package ahp.validation;

import ahp.Hierarchy;

/**
 * A sample validator interface for {@link ahp.Goal}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface GoalValidator {
	boolean validate();

	boolean validateHierarchy(Hierarchy value);
}